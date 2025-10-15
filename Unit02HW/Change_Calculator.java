// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class Change_Calculator {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount due ($): ");
        double AmountDue = scanner.nextDouble(); 

        System.out.print("Enter the amount paid ($): ");
        double AmountPaid = scanner.nextDouble();
        
        double TotalChangeDollars = AmountPaid - AmountDue;

        int TotalChangePennies = (int) Math.round(TotalChangeDollars * 100.0);
        
        if (TotalChangePennies < 0) {
            System.out.printf("\nError: The amount paid (%.2f) is less than the amount due (%.2f).\n", AmountPaid,
                    AmountDue);
            return;
        }
        int RemainingPennies = TotalChangePennies;

        int dollars = RemainingPennies / 100;
        RemainingPennies %= 100;

        int quarters = RemainingPennies / 25;
        RemainingPennies %= 25;

        int dimes = RemainingPennies / 10;
        RemainingPennies %= 10;

        int nickels = RemainingPennies / 5;
        RemainingPennies %= 5;

        int pennies = RemainingPennies;
        
        System.out.println();
        
        System.out.printf("%-10s %d\n", "Dollars:", dollars);
        System.out.printf("%-10s %d\n", "Quarters:", quarters);
        System.out.printf("%-10s %d\n", "Dimes:", dimes);
        System.out.printf("%-10s %d\n", "Nickels:", nickels);
        System.out.printf("%-10s %d\n", "Pennies:", pennies);
    }
}
