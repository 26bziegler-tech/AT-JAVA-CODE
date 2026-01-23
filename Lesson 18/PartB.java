// Brennan Ziegler
// AT Software Design with Java

import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        ArrayList<Double> Scores = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a test score or q to quit: ");
            String UserInput = in.nextLine();

            if (UserInput.equalsIgnoreCase("q")) {
                break;
            }

            Scores.add(Double.parseDouble(UserInput));
        }

        double Total = 0;

        for (double Score : Scores) {
            System.out.printf("%.2f%n", Score);
            Total += Score;
        }

        double Average = Total / Scores.size();
        System.out.printf("Average: %.2f%n", Average);
    }
}
