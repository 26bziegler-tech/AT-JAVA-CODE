// Brennan Ziegler
// AT Software Design With JAVA

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class PartC {

    public static void draw(Graphics g) {

        int centerX = 200;
        int centerY = 200;
        int scale = 150;
        int steps = 1000;

        for (int i = 0; i < steps; i++) {

            double theta = 2 * Math.PI * i / steps;
            double r = Math.cos(2 * theta);

            int x = centerX + (int)(scale * r * Math.cos(theta));
            int y = centerY - (int)(scale * r * Math.sin(theta));

            g.fillRect(x, y, 2, 2);
        }
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

