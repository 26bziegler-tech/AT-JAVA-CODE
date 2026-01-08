// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] Scores = new double[10];
        int Count = 0;
        double Sum = 0;
        double Max = 0;

        System.out.println("Enter test scores (type 'q' to quit):");

        while (Count < Scores.length) {
            String UserInput = in.nextLine();

            if (UserInput.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double Score = Double.parseDouble(UserInput);
                Scores[Count] = Score;
                Sum += Score;

                if (Count == 0 || Score > Max) {
                    Max = Score;
                }

                Count++;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number or 'q' to quit.");
            }
        }

        if (Count > 0) {
            double Average = Sum / Count;

            System.out.println("\nResults:");
            System.out.println("Number of scores entered: " + Count);
            System.out.println("Average score: " + Average);
            System.out.println("Highest score: " + Max);
        } else {
            System.out.println("No scores were entered.");
        }
    }
}
