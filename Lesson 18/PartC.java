// Brennan Ziegler
// AT Software Design with Java

import java.util.ArrayList;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        ArrayList<Integer> Temps = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a temperature or q to quit: ");
            String UserInput = in.nextLine();

            if (UserInput.equalsIgnoreCase("q")) {
                break;
            }

            Temps.add(Integer.parseInt(UserInput));
        }

        int Lowest = Temps.get(0);
        for (int t : Temps) {
            if (t < Lowest) {
                Lowest = t;
            }
        }

        for (int t : Temps) {
            if (t == Lowest) {
                System.out.println(t + " <= lowest");
            } else {
                System.out.println(t);
            }
        }
    }
}
