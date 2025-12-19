// Brennan Ziegler
// AT Software Design With JAVA

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class PartA {

    public static void draw(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 300, 300);

        g.setColor(Color.BLACK);
        g.drawOval(50, 50, 300, 300);

        g.fillOval(130, 140, 40, 40);

        g.fillOval(230, 140, 40, 40);

        g.drawLine(120, 240, 280, 240);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent component = new JComponent() {
            public void paintComponent(Graphics g) {
                draw(g);
            }
        };

        frame.add(component);
        frame.setVisible(true);
    }
}