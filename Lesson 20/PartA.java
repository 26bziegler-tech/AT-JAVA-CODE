// Brennan Ziegler
// AT Software Design with Java

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        try {
            File CustomerFile = new File("customerdata.txt");
            Scanner FileScanner = new Scanner(CustomerFile);

            FileScanner.useDelimiter("[\\s,\\n]+");

            System.out.println("---------------------------------------");
            System.out.println("    ID  |    Name     |     Balance ");
            System.out.println("---------------------------------------");

            while (FileScanner.hasNext()) {
                if (FileScanner.hasNextInt()) {
                    int id = FileScanner.nextInt();
                    String Name = FileScanner.next();
                    double Balance = FileScanner.nextDouble();

                    System.out.printf("%06d | %11s | $ %,14.2f\n", id, Name, Balance);
                } else {
                    FileScanner.next();
                }
            }

            FileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'customerdata.txt' was not found.");
        }
    }
}