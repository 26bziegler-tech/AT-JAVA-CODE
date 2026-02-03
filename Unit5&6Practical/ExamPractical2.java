// Brennan Ziegler
// AT Software Design with Java

import java.util.ArrayList;
import java.util.Scanner;

public class ExamPractical2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> Scores = new ArrayList<>();

        while (true) {
            System.out.print("Enter a quiz score or 'q' to quit: ");
            if (in.hasNextDouble()) {
                Scores.add(in.nextDouble());
            } else {
                String Input = in.next();
                if (Input.equalsIgnoreCase("q")) {
                    break;
                }
            }
        }

        if (Scores.size() > 0) {
            double Sum = 0;
            System.out.println("-------------------------------");
            for (double Score : Scores) {
                System.out.printf("%6.2f%n", Score);
                Sum += Score;
            }
            System.out.println("-------------------------------");
            
            double Average = Sum / Scores.size();
            System.out.printf("Avg = %.2f%n", Average);
        }
    }
}

