import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class TempReader {
    public static void main(String[] args) {

        ArrayList<Integer> Temps = new ArrayList<>();
        
        int Lowest = Integer.MAX_VALUE;

        try {
            File File = new File("temps.txt");
            Scanner InputFile = new Scanner(File);

            while (InputFile.hasNextInt()) {
                int CurrentTemp = InputFile.nextInt();
                Temps.add(CurrentTemp);
                
                if (CurrentTemp < Lowest) {
                    Lowest = CurrentTemp;
                }
            }

            InputFile.close();

            for (int Temp : Temps) {
                System.out.print(Temp);
                
                if (Temp == Lowest) {
                    System.out.print(" <= lowest");
                }
                
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: temps.txt not found.");
        }
    }
}