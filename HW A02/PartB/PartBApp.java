import javax.swing.*;

public class PartBApp extends JFrame {
    public PartBApp() {
        add(new PartBBoard());
        setTitle("Homework A02 - Part B Animation");
        setResizable(false);
        pack(); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PartBApp app = new PartBApp();
            app.setVisible(true);
        });
    }
}
