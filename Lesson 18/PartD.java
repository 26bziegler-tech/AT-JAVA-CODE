// Brennan Ziegler
// AT Software Design with Java

import java.util.ArrayList;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer or q to quit: ");
            String UserInput = in.nextLine();

            if (UserInput.equalsIgnoreCase("q")) {
                break;
            }

            Numbers.add(Integer.parseInt(UserInput));
        }

        for (int i = Numbers.size() - 1; i >= 0; i--) {
            if (Numbers.get(i) % 2 != 0) {
                Numbers.remove(i);
            }
        }

        for (int n : Numbers) {
            System.out.println(n);
        }
    }
}
