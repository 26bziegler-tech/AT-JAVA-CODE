// Brennan Ziegler
// AT Software Design with Java

// import scanner
import java.util.Scanner;

public class HowMuchChangeOwed {
    public static void main(String[] args) {

        // create scanner using keyborad
        Scanner in = new Scanner(System.in);

        // ask user amount of money they have in scents
        System.out.print("Enter amount of money in cents owed to customer: ");
        int owed = in.nextInt();

        int LeftOver1 = owed % 25;
        int quarters = (owed - LeftOver1) / 25;
        int LeftOver2 = LeftOver1 % 10;
        int dimes = (LeftOver1 - LeftOver2) / 10;
        int LeftOver3 = LeftOver2 % 5;
        int nickels = (LeftOver2 - LeftOver3) / 5;
        int pennies = LeftOver3;

        System.out.println("Give the customer");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
