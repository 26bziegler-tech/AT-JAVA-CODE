// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Is it Monday? (y/n): ");
        String Monday = in.nextLine().trim().toLowerCase();

        System.out.print("Enter the customer's age: ");
        int Age = in.nextInt();

        System.out.print("Enter the cost of the meal ($): ");
        double Cost = in.nextDouble();

        double Discount = 0.0;

        if (Monday.equals("y")) {
            if (Age < 13) {
                Discount = 0.075; 
            } else if (Age >= 50) {
                Discount = 0.15;
            } else {
                Discount = 0.05; 
            }
        } else {
            if (Age < 13) {
                Discount = 0.05; 
            } else if (Age >= 50) {
                Discount = 0.075; 
            } else {
                Discount = 0.0; 
            }
        }

        double Discounted = Cost * Discount;
        double FinalCost = Cost - Discounted;

        System.out.printf("Discount applied: %.1f%%\n", Discount * 100);
        System.out.printf("Discount amount: $%.2f\n", Discounted);
        System.out.printf("Total after discount: $%.2f\n", FinalCost);

    }
}
