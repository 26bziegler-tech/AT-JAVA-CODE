// Brennan Ziegler
// AT Software Design with Java

import javax.swing.JOptionPane;

public class DialogCalculator {
    public static void main(String[] args) {
    
        String name = JOptionPane.showInputDialog("Enter your name:");

        String FirstNumberStr = JOptionPane.showInputDialog("Enter the first number:");
        double FirstNumber = Double.parseDouble(FirstNumberStr);

        String SecondNumberStr = JOptionPane.showInputDialog("Enter the second number:");
        double SecondNumber = Double.parseDouble(SecondNumberStr);

        double result = FirstNumber + SecondNumber;

        JOptionPane.showMessageDialog(null, name + ", the sum of your numbers is: " + result);
    }
}
