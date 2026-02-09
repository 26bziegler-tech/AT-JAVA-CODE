// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartB {
    public static void main(String[] args) {
        try {
            File InputFile = new File("sales_by_cat.txt");
            Scanner Reader = new Scanner(InputFile);

            while (Reader.hasNextLine()) {
                String Line = Reader.nextLine();
                
                String[] Parts = Line.split(", ");

                if (Parts.length >= 3) {
                    String Dept = Parts[0];
                    String Manager = Parts[1];
                    String RevenueRaw = Parts[2];
                    double Revenue;

                    if (Dept.contains("] ")) {
                        Dept = Dept.substring(Dept.indexOf("] ") + 2);
                    }

                    if (RevenueRaw.equalsIgnoreCase("n/a")) {
                        Revenue = 0.00;
                    } else {
                        try {
                            Revenue = Double.parseDouble(RevenueRaw);
                        } catch (NumberFormatException e) {
                            Revenue = 0.00; 
                        }
                    }

                    System.out.printf("%-20s | %-15s | $ %10.2f\n", 
                                      Dept, Manager, Revenue);
                }
            }
            Reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'sales_by_cat.txt' was not found.");
        }
    }
}