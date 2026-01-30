import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class QuizProcessor {
    public static void main(String[] args) {
        try {
            File InputFile = new File("quizzes.txt");
            Scanner Reader = new Scanner(InputFile);

            PrintWriter Writer = new PrintWriter("quizzesMod.txt");

            double Total = 0;
            int Count = 0;

            while (Reader.hasNextDouble()) {
                double Score = Reader.nextDouble();
                
                Writer.printf("Quiz %03d: %7.2f\n", Count, Score);
                
                Total += Score;
                Count++;
            }

            if (Count > 0) {
                double Average = Total / Count;
                Writer.println("-----------------");
                Writer.printf("Average: %8.2f\n", Average);
            }

            Reader.close();
            Writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: quizzes.txt not found.");
        }
    }
}