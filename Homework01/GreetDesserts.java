import java.awt.Toolkit;
import java.util.Scanner;

// Brennan Ziegler
// AT Software Design with Java Homework 01

// * This Program displays a greeting to the user.
// *It also asks them there favorite dessert, before stating that its the best.

public class GreetDesserts {
    public static void main(String[] args) {
        System.out.println("This is my Third Program.");
   
        // make it beep!
        Toolkit.getDefaultToolkit().beep();

        // get user name.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");

        // get user favorite dessert.
        System.out.print("What is your favorite dessert?:");
        String dessert = in.nextLine();
        System.out.println("OH MY GOSH " + name + ", " + dessert + " is the best!");
    }
}
