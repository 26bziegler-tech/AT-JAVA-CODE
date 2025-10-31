// Brennan Ziegler
// AT Software Design With JAVA

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the APR (as a percentage, for example, 5.5): ");
        double Apr = in.nextDouble();

        System.out.print("Enter the balance: ");
        double Balance = in.nextDouble();

        System.out.println("Year |   Int Earned ($)   |   Balance ($)");
        System.out.println("-------------------------------------------");

        for (int Year = 1; Year <= 5; Year++) {
            double Interest = Balance * (Apr / 100);
            Balance += Interest;

            System.out.printf("%-4d | %16.2f | %13.2f\n", Year, Interest, Balance);
        }
    }
}

