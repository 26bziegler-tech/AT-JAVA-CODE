// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class CougarBaking {
    public static void main(String[] args) {
    
        final double PIE_PRICE = 10.00;
        final double DISCOUNT_RATE = 0.10; 
        final int DISCOUNT_THRESHOLD = 3;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the number of pies you would like to buy: ");
        
        int NumberOfPies = scanner.nextInt();

        double Subtotal = NumberOfPies * PIE_PRICE;
        double TotalCost;

        if (NumberOfPies >= DISCOUNT_THRESHOLD) {
    
            TotalCost = Subtotal * (1 - DISCOUNT_RATE);
            
            System.out.printf("\nYour subtotal is: $%.2f\n", Subtotal);
            System.out.println("A 10% discount has been applied to your order.");
        } else {
        
            TotalCost = Subtotal;
            System.out.println("\nNo discount applied.");
        }
        System.out.printf("Your final total cost is: $%.2f\n", TotalCost);
    }
}