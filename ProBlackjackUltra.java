import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.Random;

public class ProBlackjackUltra extends JFrame {

    private ArrayList<Card> playerHand = new ArrayList<>();
    private ArrayList<Card> dealerHand = new ArrayList<>();
    private int wallet = 2500, currentBet = 0;
    private String status = "PLACE YOUR BETS";
    private boolean showDealer = false, playing = false, roundOver = true;
    
    private final Color GOLDENROD = new Color(218, 165, 32);

    public ProBlackjackUltra() {
        setUndecorated(true); 
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        
        JPanel table = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                renderScene((Graphics2D) g);
            }
        };
        table.setBackground(new Color(0, 60, 0));
        add(table);

        JPanel controls = new JPanel();
        controls.setBackground(new Color(20, 20, 20));
        
        JButton btnBet10 = new JButton("BET $10");
        JButton btnBet50 = new JButton("BET $50");
        JButton btnBet100 = new JButton("BET $100");
        JButton btnHit = new JButton("HIT");
        JButton btnStay = new JButton("STAY");
        JButton btnNext = new JButton("DEAL / NEXT ROUND");
        JButton btnExit = new JButton("EXIT");

        styleButton(btnBet10); styleButton(btnBet50); styleButton(btnBet100);
        styleButton(btnHit); styleButton(btnStay); styleButton(btnNext); styleButton(btnExit);

        btnBet10.addActionListener(e -> addBet(10));
        btnBet50.addActionListener(e -> addBet(50));
        btnBet100.addActionListener(e -> addBet(100));

        btnHit.addActionListener(e -> {
            if (playing && !showDealer) {
                playerHand.add(new Card());
                if (getScore(playerHand) > 21) endRound("PLAYER BUSTS!");
                repaint();
            }
        });

        btnStay.addActionListener(e -> { 
            if (playing && !showDealer && !playerHand.isEmpty()) dealerLogic(); 
        });

        // This now handles both starting the first deal and resetting for the next
        btnNext.addActionListener(e -> {
            if (roundOver) {
                if (currentBet > 0) {
                    dealInitial();
                } else {
                    status = "PLACE A BET FIRST!";
                }
                repaint();
            }
        });

        btnExit.addActionListener(e -> System.exit(0));

        controls.add(btnBet10); controls.add(btnBet50); controls.add(btnBet100);
        controls.add(btnHit); controls.add(btnStay); controls.add(btnNext); controls.add(btnExit);
        add(controls, BorderLayout.SOUTH);

        if (gd.isFullScreenSupported()) {
            gd.setFullScreenWindow(this);
        } else {
            setSize(1920, 1080);
            setVisible(true);
        }
    }

    private void addBet(int amount) {
        if (roundOver) {
            // If starting a fresh round after a win/loss, clear old visuals
            if (playerHand.size() > 0) {
                playerHand.clear();
                dealerHand.clear();
                currentBet = 0;
            }
            
            if (wallet >= amount) {
                wallet -= amount;
                currentBet += amount;
                status = "TOTAL BET: $" + currentBet + " - CLICK DEAL";
                repaint();
            }
        }
    }

    private void dealInitial() {
        playing = true;
        roundOver = false;
        showDealer = false;
        playerHand.clear();
        dealerHand.clear();
        playerHand.add(new Card());
        dealerHand.add(new Card());
        playerHand.add(new Card());
        dealerHand.add(new Card());
        status = "GOOD LUCK!";
    }

    private void dealerLogic() {
        showDealer = true;
        while (getScore(dealerHand) < 17) dealerHand.add(new Card());
        
        int p = getScore(playerHand), d = getScore(dealerHand);
        if (d > 21 || p > d) { 
            wallet += currentBet * 2; 
            endRound("YOU WIN $" + (currentBet * 2) + "!"); 
        } else if (d > p) { 
            endRound("DEALER WINS"); 
        } else { 
            wallet += currentBet; 
            endRound("PUSH (TIE)"); 
        }
    }

    private void endRound(String s) {
        status = s;
        showDealer = true;
        playing = false;
        roundOver = true;
        repaint();
    }

    private void styleButton(JButton b) {
        b.setBackground(new Color(40, 40, 40));
        b.setForeground(GOLDENROD);
        b.setFocusPainted(false);
        b.setFont(new Font("Arial", Font.BOLD, 14));
        b.setBorder(BorderFactory.createLineBorder(GOLDENROD, 1));
        b.setPreferredSize(new Dimension(160, 40));
    }

    private void renderScene(Graphics2D g2) {
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth(), h = getHeight();

        GradientPaint gp = new GradientPaint(0, 0, new Color(0, 100, 0), 0, h, new Color(0, 40, 0));
        g2.setPaint(gp);
        g2.fillRect(0, 0, w, h);

        g2.setColor(new Color(255, 215, 0, 50));
        g2.setStroke(new BasicStroke(5));
        g2.drawOval(w/2 - 400, h/2 - 300, 800, 600);

        g2.setColor(new Color(0, 0, 0, 200));
        g2.fillRoundRect(w - 300, 50, 250, 120, 20, 20);
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Georgia", Font.BOLD, 24));
        g2.drawString("BANKROLL", w - 280, 85);
        g2.setColor(GOLDENROD);
        g2.drawString("$" + wallet, w - 280, 120);
        g2.setFont(new Font("Georgia", Font.PLAIN, 18));
        g2.drawString("CURRENT BET: $" + currentBet, w - 280, 150);

        g2.setFont(new Font("Georgia", Font.BOLD, 50));
        g2.setColor(new Color(255, 255, 255, 120));
        g2.drawString(status, w/2 - g2.getFontMetrics().stringWidth(status)/2, h/2);

        for (int i = 0; i < dealerHand.size(); i++) 
            drawCard(g2, dealerHand.get(i), w/2 - 100 + (i * 40), 100, (i == 1 && !showDealer));

        for (int i = 0; i < playerHand.size(); i++) 
            drawCard(g2, playerHand.get(i), w/2 - 100 + (i * 40), h - 350, false);
    }

    private void drawCard(Graphics2D g2, Card card, int x, int y, boolean hidden) {
        int cw = 140, ch = 200;
        g2.setColor(new Color(0, 0, 0, 100));
        g2.fillRoundRect(x+5, y+5, cw, ch, 20, 20);
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(x, y, cw, ch, 20, 20);
        
        if (hidden) {
            g2.setColor(new Color(139, 0, 0));
            g2.fillRoundRect(x+10, y+10, cw-20, ch-20, 15, 15);
            g2.setColor(GOLDENROD);
            g2.setStroke(new BasicStroke(2));
            g2.drawRect(x+15, y+15, cw-30, ch-30);
            return;
        }

        Color suitColor = (card.suit.equals("♥") || card.suit.equals("♦")) ? new Color(200, 0, 0) : Color.BLACK;
        g2.setColor(suitColor);
        g2.setFont(new Font("Arial", Font.BOLD, 28));
        g2.drawString(card.rank, x + 15, y + 35);
        g2.setFont(new Font("Serif", Font.PLAIN, 90));
        g2.drawString(card.suit, x + (cw/2 - 35), y + (ch/2 + 30));
    }

    public int getScore(ArrayList<Card> hand) {
        int s = 0, a = 0;
        for (Card c : hand) { s += c.val; if (c.rank.equals("A")) a++; }
        while (s > 21 && a > 0) { s -= 10; a--; }
        return s;
    }

    class Card {
        String suit, rank; int val;
        public Card() {
            String[] s = {"♠", "♥", "♣", "♦"}, r = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
            int[] v = {2,3,4,5,6,7,8,9,10,10,10,10,11};
            Random rnd = new Random(); int i = rnd.nextInt(13);
            suit = s[rnd.nextInt(4)]; rank = r[i]; val = v[i];
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProBlackjackUltra());
    }
}