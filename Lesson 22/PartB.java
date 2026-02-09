// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartB {
    public static void main(String[] args) {
        File File = new File("birthyears.txt");

        try {
            Scanner in = new Scanner(File);

            while (in.hasNextLine()) {
                String Line = in.nextLine();
                
                String[] Parts = Line.split(",");
                
                if (Parts.length >= 2) {
                    String Name = Parts[0].trim(); 
                    String YearString = Parts[1].trim();

                    try {
                        int Year = Integer.parseInt(YearString);
                        System.out.println(Name + " was born in " + Year + ".");
                    } catch (NumberFormatException e) {
                        System.out.println("I do not know what year " + Name + " was born.");
                    }
                }
            }
            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'birthyears.txt' could not be found.");
        }
    }
}