// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class AccountBalanceFormatting {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first account ID (1 - 99999): ");
        int ID1 = in.nextInt();
        System.out.printf("Enter the account balance ($0.01 - $999,999,999.99) for ID #%06d ($): ", ID1);
        double BALANCE1 = in.nextDouble();
        System.out.print("Enter the second account ID (1 - 99999): ");
        int ID2 = in.nextInt();
        System.out.printf("Enter the account balance ($0.01 - $999,999,999.99) for ID #%06d ($): ", ID2);
        double BALANCE2 = in.nextDouble();
        System.out.print("Enter the third account ID (1 - 99999): ");
        int ID3 = in.nextInt();
        System.out.printf("Enter the account balance ($0.01 - $999,999,999.99) for ID #%06d ($): ", ID3);
        double BALANCE3 = in.nextDouble();

        System.out.printf("Account #%06d has a balance of $%12.2f%n", ID1, BALANCE1);
        System.out.printf("Account #%06d has a balance of $%12.2f%n", ID2, BALANCE2);
        System.out.printf("Account #%06d has a balance of $%12.2f%n", ID3, BALANCE3);
    }
}