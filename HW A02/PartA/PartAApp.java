import javax.swing.*;

public class PartAApp extends JFrame {
    public PartAApp() {
        add(new PartABoard());
        setTitle("Homework A02 - Part A");
        setResizable(false);
        pack(); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PartAApp app = new PartAApp();
            app.setVisible(true);
        });
    }
}