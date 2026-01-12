// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class PartB {

    public static int insert(double[] Array, int CurrentSize, int TargetIndex, double NewElement) {
        
        if (CurrentSize >= Array.length || TargetIndex < 0 || TargetIndex > CurrentSize) {
            return CurrentSize;
        }

        for (int i = CurrentSize; i > TargetIndex; i--) {
            Array[i] = Array[i - 1];
        }

        Array[TargetIndex] = NewElement;

        return CurrentSize + 1;
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

            System.out.println("\nResults before insert:");
            System.out.println("Number of scores entered: " + Count);
            System.out.println("Average score: " + Average);
            System.out.println("Highest score: " + Max);

            System.out.print("\nEnter an index to insert at (0 to " + Count + "): ");
            int Index = in.nextInt();

            System.out.print("Enter a new score to insert: ");
            double NewScore = in.nextDouble();

            Count = insert(Scores, Count, Index, NewScore);

            Sum = 0;
            Max = 0;
            for (int i = 0; i < Count; i++) {
                Sum += Scores[i];
                if (i == 0 || Scores[i] > Max) {
                    Max = Scores[i];
                }
            }

            Average = Sum / Count;

            System.out.println("\nResults after insert:");
            System.out.println("Number of scores entered: " + Count);
            System.out.println("Average score: " + Average);
            System.out.println("Highest score: " + Max);

        } else {
            System.out.println("No scores were entered.");
        }
    }
}
