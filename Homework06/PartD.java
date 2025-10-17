// Brennan Ziegler
// AT Software Design With JAVA

import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double COST_COOKIE = 0.99;

        System.out.print("Please enter the number of cookies you would like to buy: ");
        int NumberOfCookies = in.nextInt();

        double UndiscountedCost = (COST_COOKIE * NumberOfCookies);
        double DiscountedCost = UndiscountedCost;

        if (NumberOfCookies > 24) {
            DiscountedCost = UndiscountedCost * 0.85; 
        } else if (NumberOfCookies > 12) {
            DiscountedCost = UndiscountedCost * 0.95; 
        } else if (NumberOfCookies > 6) {
            DiscountedCost = UndiscountedCost * 0.975; 
        }
        System.out.printf("Your total discounted cost is: $%.2f%n", DiscountedCost);
    }
}

