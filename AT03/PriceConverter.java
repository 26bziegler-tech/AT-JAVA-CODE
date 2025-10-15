// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class PriceConverter {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a price in dollar and cents format (ex: 21.74): ");
        
        double Price = scanner.nextDouble();

        int Dollars = (int) Price;

        int Cents = (int) Math.round((Price - Dollars) * 100);

        System.out.println("The price entered is: $" + String.format("%.2f", Price));
        System.out.println("That is equal to: " + Dollars + " whole dollars and " + Cents + " cents");
    }
}