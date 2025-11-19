// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = in.nextLine();

        int total = 0;

        // Bug 1: min starts at 0, which messes with min tracking if all scores are above 0
        // original:
        // int min = 0;
        // Fix: set min to a high value so real scores will replace it
        int min = 100;

        // Bug 2: max starts at -1 which is okay, but min was wrong so they didn't work together
        // max is fine, so no change needed
        int max = -1;

        final int COUNT = 4;

        for (int i = 1; i <= COUNT; i++) {
            System.out.print("Enter score " + i + " (0-100): ");
            int s = in.nextInt();

            // Bug 3: This condition won't run because "s < 0 && s > 100" can’t be true
            // Original:
            // if (s < 0 && s > 100) {
            // Fix: must use || instead of &&
            if (s < 0 || s > 100) {
                if (s < 0)
                    s = 0;
                if (s > 100)
                    s = 100;
            }

            if (s < min)
                min = s;
            if (s > max)
                max = s;

            total += s;
        }

        // Bug 4: avg calculation is wrong because integer division happens first
        // Original:
        // double avg = (double)(total / COUNT);
        // Fix: cast before dividing
        double avg = (double) total / COUNT;

        // Bug 5: semicolon breaks the logic
        // Original:
        // if (avg >= 60)
        //     ;
        // {
        //     passed = true;
        // }
        // The semicolon ends the if, so passed = true always runs
        boolean passed = false;
        if (avg >= 60) {
            passed = true;
        }

        char letter = 'F';
        if (avg >= 90) {
            letter = 'A';
        } else if (avg >= 80) {
            letter = 'B';
        } else if (avg >= 70) {
            letter = 'C';
        } else if (avg >= 60) {
            letter = 'D';
        } else {
            letter = 'F';
        }

        System.out.println("\n----- Report -----");
        System.out.println("Name: " + name);
        System.out.println("Highest single score recorded: " + max);
        System.out.println("Lowest single score recorded: " + min);
        System.out.println("Passed? " + passed);
        System.out.printf("Average: %.2f\n", avg);
        System.out.println("Letter grade: " + letter);

        in.close();
    }
}


