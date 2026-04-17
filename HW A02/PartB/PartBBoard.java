import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class PartBBoard extends JPanel implements ActionListener {
    private BufferedImage img;
    private double x = 0; 
    private double y = 0; 
    private double angle = 0;
    private final int BOARD_SIZE = 720; 
    private Timer timer;

    public PartBBoard() {
        setPreferredSize(new Dimension(BOARD_SIZE, BOARD_SIZE));
        setBackground(Color.BLACK);
        try {
            img = ImageIO.read(new File("Andy.png"));
        } catch (IOException e) {
            System.err.println("Error: Image 'Andy.png' not found.");
        }

        timer = new Timer(25, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += 1;
        y += 1;

        angle += 5;

        if (x >= BOARD_SIZE) x = 0;
        if (y >= BOARD_SIZE) y = 0;

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img == null) return;

        Graphics2D g2d = (Graphics2D) g;
        AffineTransform at = new AffineTransform();

        at.translate(x, y);

        at.rotate(Math.toRadians(angle));

        at.translate(-img.getWidth() / 2.0, -img.getHeight() / 2.0);

        g2d.drawImage(img, at, null);
    }
}
