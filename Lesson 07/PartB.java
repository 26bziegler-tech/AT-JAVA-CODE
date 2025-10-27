// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class PartB {

    enum CustomerType {
        CHILD, ADULT, SENIOR
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Is it Monday? (y/n): ");
        String Monday = in.nextLine().trim().toLowerCase();

        System.out.print("Enter the customer's age: ");
        int Age = in.nextInt();

        System.out.print("Enter the cost of the meal ($): ");
        double Cost = in.nextDouble();

        CustomerType Type;
        if (Age < 13) {
            Type = CustomerType.CHILD;
        } else if (Age >= 50) {
            Type = CustomerType.SENIOR;
        } else {
            Type = CustomerType.ADULT;
        }

        double Discount = 0.0;

        if (Monday.equals("y")) {
            switch (Type) {
                case CHILD:
                    Discount = 0.075;
                    break;
                case SENIOR:
                    Discount = 0.15;
                    break;
                case ADULT:
                    Discount = 0.05;
                    break;
            }
        } else {
            switch (Type) {
                case CHILD:
                    Discount = 0.05;
                    break;
                case SENIOR:
                    Discount = 0.075;
                    break;
                case ADULT:
                    Discount = 0.0;
                    break;
            }
        }

        double Discounted = Cost * Discount;
        double FinalCost = Cost - Discounted;

        System.out.printf("Customer type: %s\n", Type);
        System.out.printf("Discount applied: %.1f%%\n", Discount * 100);
        System.out.printf("Discount amount: $%.2f\n", Discounted);
        System.out.printf("Total after discount: $%.2f\n", FinalCost);
    }
}
