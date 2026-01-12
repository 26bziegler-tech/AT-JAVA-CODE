// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class PartA {

    public static int remove(double[] Array, int CurrentSize, int TargetIndex) {

        if (TargetIndex < 0 || TargetIndex >= CurrentSize) {
            return CurrentSize;
        }

        for (int i = TargetIndex; i < CurrentSize - 1; i++) {
            Array[i] = Array[i + 1];
        }

        return CurrentSize - 1;
    }

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

            System.out.println("\nResults before removal:");
            System.out.println("Number of scores entered: " + Count);
            System.out.println("Average score: " + Average);
            System.out.println("Highest score: " + Max);

            System.out.print("\nEnter an index to remove (0 to " + (Count - 1) + "): ");
            int IndexToRemove = in.nextInt();

            Count = remove(Scores, Count, IndexToRemove);

            Sum = 0;
            Max = 0;
            for (int i = 0; i < Count; i++) {
                Sum += Scores[i];
                if (i == 0 || Scores[i] > Max) {
                    Max = Scores[i];
                }
            }

            if (Count > 0) {
                Average = Sum / Count;

                System.out.println("\nResults after removal:");
                System.out.println("Number of scores entered: " + Count);
                System.out.println("Average score: " + Average);
                System.out.println("Highest score: " + Max);
            } else {
                System.out.println("\nAll scores were removed.");
            }

        } else {
            System.out.println("No scores were entered.");
        }
    }
}
