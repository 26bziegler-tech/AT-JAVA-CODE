import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class GraphicTemplate {
    
    public static void draw(Graphics g) {
        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 400, 400);

        g.setColor(Color.ORANGE);
        g.fillRect(190, 100, 20, 250);

        g.setColor(Color.WHITE);
        g.fillRect(175, 150, 10, 180);

        g.setColor(Color.WHITE);
        g.fillRect(215, 150, 10, 180);

        g.setColor(Color.GRAY);
        g.fillOval(188, 80, 24, 30);

        g.setColor(Color.YELLOW);
        g.fillOval(192, 350, 16, 40);
    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }
        return val;
    }

    public static void main(String[] args) {
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;

        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            default:
                break;
        }

        JFrame frame = new JFrame();
        frame.setSize(CONTENT_WIDTH + 2 * border_width, CONTENT_HEIGHT + bar_height + border_width);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SLS Rocket");

        JComponent component = new JComponent() {
            @Override
            public void paintComponent(Graphics graph) {
                draw(graph); 
            }
        };

        frame.add(component);
        frame.setVisible(true);
    }
}