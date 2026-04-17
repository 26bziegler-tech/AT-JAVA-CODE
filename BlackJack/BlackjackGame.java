import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BlackjackGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepPlaying = true;

        System.out.println("Welcome to Blackjack!");

        while (keepPlaying) {
            System.out.println("\nWould you like to (P)lay a hand or (Q)uit?");
            String choice = input.nextLine().toUpperCase();

            if (choice.equals("P")) {
                playHand(input);
            } else {
                keepPlaying = false;
                System.out.println("Thanks for playing!");
            }
        }
    }

    public static void playHand(Scanner input) {
        ArrayList<Card> playerHand = new ArrayList<>();
        ArrayList<Card> dealerHand = new ArrayList<>();

        playerHand.add(drawCard());
        dealerHand.add(drawCard());
        playerHand.add(drawCard());
        dealerHand.add(drawCard());

        System.out.println("\n--- Initial Deal ---");
        System.out.println("Dealer's visible card: " + dealerHand.get(0));
        System.out.println("Your hand: " + playerHand + " (Score: " + calculateScore(playerHand) + ")");

        int pScore = calculateScore(playerHand);
        int dScore = calculateScore(dealerHand);

        if (pScore == 21 || dScore == 21) {
            resolveBlackjack(pScore, dScore, dealerHand);
            return;
        }

        boolean playerBusted = false;
        while (true) {
            System.out.print("\nDo you want to (H)it or (S)tand? ");
            String action = input.nextLine().toUpperCase();

            if (action.equals("H")) {
                playerHand.add(drawCard());
                pScore = calculateScore(playerHand);
                System.out.println("You drew: " + playerHand.get(playerHand.size() - 1));
                System.out.println("Your current score: " + pScore);

                if (pScore > 21) {
                    System.out.println("Bust! You lose.");
                    playerBusted = true;
                    break;
                }
            } else {
                break;
            }
        }

        if (!playerBusted) {
            System.out.println("\n--- Dealer's Turn ---");
            System.out.println("Dealer reveals second card: " + dealerHand.get(1));
            
            dScore = calculateScore(dealerHand);
            while (dScore < 17) {
                delay(1000); 
                dealerHand.add(drawCard());
                dScore = calculateScore(dealerHand);
                System.out.println("Dealer hits and gets: " + dealerHand.get(dealerHand.size() - 1));
                System.out.println("Dealer's current score: " + dScore);
            }

            determineWinner(pScore, dScore);
        }
    }

    public static int calculateScore(ArrayList<Card> hand) {
        int score = 0;
        int aceCount = 0;

        for (Card card : hand) {
            score += card.getValue();
            if (card.getRank().equals("Ace")) {
                aceCount++;
            }
        }

        while (score > 21 && aceCount > 0) {
            score -= 10; 
            aceCount--;
        }

        return score;
    }

    public static Card drawCard() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        Random rand = new Random();
        return new Card(suits[rand.nextInt(4)], ranks[rand.nextInt(13)]);
    }

    public static void determineWinner(int pScore, int dScore) {
        System.out.println("\n--- Final Results ---");
        System.out.println("Your Score: " + pScore);
        System.out.println("Dealer Score: " + dScore);

        if (dScore > 21) {
            System.out.println("Dealer busted! You win!");
        } else if (pScore > dScore) {
            System.out.println("You win!");
        } else if (dScore > pScore) {
            System.out.println("Dealer wins.");
        } else {
            System.out.println("It's a draw (Push).");
        }
    }

    private static void resolveBlackjack(int pScore, int dScore, ArrayList<Card> dHand) {
        System.out.println("Dealer reveals: " + dHand.get(1));
        if (pScore == 21 && dScore == 21) {
            System.out.println("Both have 21! It's a draw.");
        } else if (pScore == 21) {
            System.out.println("Blackjack! You win!"); 
        } else {
            System.out.println("Dealer has Blackjack. You lose.");
        }
    }

    public static void delay(long msec) {
        try {
            Thread.sleep(msec);
        } catch (Exception e) {}
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
