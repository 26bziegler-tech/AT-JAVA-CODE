// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class Monogram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first middle and last names: ");
        String first = input.next();
        String middle = input.next();
        String last = input.next();

        String monogram = first.substring(0, 1).toUpperCase() +
                          middle.substring(0, 1).toUpperCase() +
                          last.substring(0, 1).toUpperCase();

        System.out.println("Your monogram is " + monogram);

    }
}
