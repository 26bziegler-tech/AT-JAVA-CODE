import java.awt.Toolkit;
import java.util.Scanner;

// Brennan Ziegler
// AT Software Design with Java Sec 01

// * This Program displays a greeting to the user.
// *It also calculates and displays the sum of two numbers

public class Greet {
    public static void main(String[] args) {
        System.out.println("This is my second program.");
        System.out.print("The sum of 7 and 3 is ");
        System.out.println(7 + 3);
   
        // make it beep!
        Toolkit.getDefaultToolkit().beep();

        // get user name.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}