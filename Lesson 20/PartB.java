import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        try {
            File CharFile = new File("characters.txt");
            Scanner FileScanner = new Scanner(CharFile);

            FileScanner.useDelimiter("");

            int TotalCount = 0;
            int LetterCount = 0;
            int DigitCount = 0;

            while (FileScanner.hasNext()) {
                char ch = FileScanner.next().charAt(0);
                
                System.out.print(ch);
                
                TotalCount++;

                if (Character.isLetter(ch)) {
                    LetterCount++;
                } 
                else if (Character.isDigit(ch)) {
                    DigitCount++;
                }
            }
            
            FileScanner.close();

            System.out.println("\ncount = " + TotalCount);
            System.out.println("letters = " + LetterCount);
            System.out.println("digits = " + DigitCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'characters.txt' was not found.");
        }
    }
}