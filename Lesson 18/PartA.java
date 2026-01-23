// Brennan Ziegler
// AT Software Design with Java

import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a name or # to quit: ");
            String Name = in.nextLine();

            if (Name.equals("#")) {
                break;
            }

            Names.add(Name);
        }

        for (String n : Names) {
            System.out.println(n);
        }
    }
}
