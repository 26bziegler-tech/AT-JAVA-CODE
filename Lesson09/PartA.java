// Brennan Ziegler
// AT Software Design With JAVA

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your test scores one by one");
        System.out.println("Enter a negative number when you are done\n");

        double Total = 0.0;
        int Count = 0;

        while (true) {
            System.out.print("Enter a test score: ");
            double Score = in.nextDouble();

            if (Score < 0) {
                break;
            }

            Total += Score;
            Count++;
        }

        if (Count > 0) {
            double Average = Total / Count;
            System.out.println("\nNumber of scores entered: " + Count);
            System.out.printf("Average test score: %.2f\n", Average);
        } else {
            System.out.println("\nNo scores were entered.");
        }
    }
}
