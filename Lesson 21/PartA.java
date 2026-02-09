// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartA {
    public static void main(String[] args) {
        try {
            File InputFile = new File("Top5Unemployment.txt");
            Scanner Reader = new Scanner(InputFile);

            System.out.println("----------------------------------------------------------------------");
            System.out.println("                    Top 5 Unemployment Rates                          ");
            System.out.println("----------------------------------------------------------------------");

            while (Reader.hasNextLine()) {
                String Line = Reader.nextLine();
                
                String[] Parts = Line.split(", ");

                if (Parts.length >= 4) {
                    String Country = Parts[0];
                    
                    if (Country.contains("] ")) {
                        Country = Country.substring(Country.indexOf("] ") + 2);
                    }

                    double Rate = Double.parseDouble(Parts[1]); 
                    int Rank = Integer.parseInt(Parts[2]);    
                    String Region = Parts[3];                  

                    System.out.printf("Ranked # %2d: %-20s | %6.2f%% | %s\n", 
                                      Rank, Country, Rate, Region);
                }
            }

            System.out.println("----------------------------------------------------------------------");
            Reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'Top5Unemployment.txt' was not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: There was a problem parsing the numbers in the file.");
        }
    }
}