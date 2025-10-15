// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class Discount_Calculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        final int MAX_DISCOUNT = 75;

        System.out.print("Enter the number of movie rentals: ");
        int rentals = scanner.nextInt(); 

        System.out.print("Enter the number of members referred to the video club: ");
        int referrals = scanner.nextInt(); 
        
        int potentialDiscount = rentals + referrals;

        int finalDiscount = Math.min(potentialDiscount, MAX_DISCOUNT);

        System.out.printf("The discount is equal to: %.2f%%\n", (double)finalDiscount);
    }
}