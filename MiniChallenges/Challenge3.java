// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = in.nextInt();

        boolean IsPrime = true;

        if (num <= 1) {
            IsPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    IsPrime = false;
                    break;
                }
            }
        }

        if (IsPrime) {
            System.out.println("That number is prime");
        } else {
            System.out.println("That number is not prime");
        }
    }
}
