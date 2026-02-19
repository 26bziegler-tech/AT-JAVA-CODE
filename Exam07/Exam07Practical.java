// Brennan Ziegler
// AT Software Design with Java

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam07Practical {
    public static void main(String[] args) {
        String FileName = "mathmeet.txt";
        double TotalScore = 0;
        int Count = 0;

        System.out.printf("%-20s | %-30s | %-5s%n", "Name", "School", "Score");
        System.out.println("-------------------------------------------------------------");

        try {
            File MyFile = new File(FileName);
            Scanner Reader = new Scanner(MyFile);

            while (Reader.hasNextLine()) {
                String Line = Reader.nextLine();
                String[] Parts = Line.split(",");
                
                if (Parts.length == 3) {
                    String Name = Parts[0].trim();
                    String School = Parts[1].trim();
                    double Score = Double.parseDouble(Parts[2].trim());

                    System.out.printf("%-20s | %-30s | %-5.2f%n", Name, School, Score);

                    TotalScore = TotalScore + Score;
                    Count = Count + 1;
                }
            }
            Reader.close();

            System.out.println("-------------------------------------------------------------");
            
            if (Count > 0) {
                double Average = TotalScore / Count;
                System.out.printf("Average Score: %.2f%n", Average);
            } else {
                System.out.println("No data found in file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not find the file.");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong reading the data.");
        }
    }
}