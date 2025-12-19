// Brennan Ziegler
// AT Software Design With JAVA

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class PartB {

    public static void draw(Graphics g) {

        final int tileSize = 100;
        int x;
        int y;

        for (int row = 0; row < 4; row++) {
            x = 0;
            y = row * tileSize;

            for (int col = 0; col < 4; col++) {

                if ((row + col) % 2 == 0) {
                    g.setColor(Color.BLUE);
                } else {
                    g.setColor(Color.RED);
                }

                g.fillRect(x, y, tileSize, tileSize);
                x = x + tileSize;
            }
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

