// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class PartA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a quiz score (0-100): ");

        try {
            int Score = getQuizScore(in);
            System.out.println("Valid score obtained: " + Score);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int getQuizScore(Scanner in) {
        String Input = in.next();
        int Score;

        try {
            Score = Integer.parseInt(Input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input: not an integer.");
        }

        if (Score < 0 || Score > 100) {
            throw new NumberFormatException("Score out of range: must be between 0 and 100.");
        }

        return Score;
    }
}
