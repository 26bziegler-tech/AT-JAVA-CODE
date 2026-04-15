import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Board extends JPanel {

    public Board() {
        setPreferredSize(new Dimension(350, 350));
        setBackground(Color.CYAN);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        AffineTransform at = new AffineTransform();

        at.translate(getWidth() / 2.0, getHeight() / 2.0);

       
        at.rotate(Math.toRadians(22.5));

      
        at.translate(-75, -75);

        g2d.setColor(Color.MAGENTA);
        Rectangle rect = new Rectangle(0, 0, 150, 150);
        g2d.fill(at.createTransformedShape(rect));

        g2d.setColor(Color.BLUE);
        g2d.drawString("Hello, world!", 20, 30);
    }
}