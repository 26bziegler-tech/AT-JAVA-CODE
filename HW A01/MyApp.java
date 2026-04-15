import javax.swing.*;

public class MyApp extends JFrame {

    public MyApp() {
        add(new Board());

        setTitle("My App");
        setResizable(false);
        pack(); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyApp app = new MyApp();
            app.setVisible(true);
        });
    }
}