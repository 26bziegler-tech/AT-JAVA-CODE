import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class PartABoard extends JPanel {
    private BufferedImage img;
    private final int CONTENT_SIZE = 350; 

    public PartABoard() {
        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.CYAN);
        try {
            img = ImageIO.read(new File("NPR-MCDONALDS-BIG-ARCH-BURGER-2026_HEADER.jpg"));
        } catch (IOException e) {
            System.err.println("Error: Image 'NPR-MCDONALDS-BIG-ARCH-BURGER-2026_HEADER.jpg' not found.");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img == null) return;

        Graphics2D g2d = (Graphics2D) g;
        AffineTransform at = new AffineTransform();

        double targetSize = CONTENT_SIZE * 1.5;
        double scaleX = targetSize / img.getWidth();
        double scaleY = targetSize / img.getHeight();

        double tx = getWidth() - targetSize;
        double ty = getHeight() - targetSize;
        at.translate(tx, ty);

        at.scale(scaleX, scaleY);

        g2d.drawImage(img, at, null);
    }
}