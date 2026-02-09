// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String FileName;

        while (true) {
            System.out.print("Enter a filename to read or '#' to quit: ");
            FileName = in.nextLine();

            if (FileName.equals("#")) {
                System.out.println("Goodbye!");
                break; 
            }

            File File = new File(FileName);

            if (File.exists()) {
                try {
                    Scanner FileScanner = new Scanner(File);
                    
                    while (FileScanner.hasNext()) {
                        String Word = FileScanner.next();
                        System.out.println(Word);
                    }
                    
                    FileScanner.close();
                    return; 

                } catch (FileNotFoundException e) {
                    System.out.println("Error: File could not be opened.");
                }
            } else {
                System.out.println("Error: The file '" + FileName + "' was not found.");
            }
        }
        
        in.close();
    }
}