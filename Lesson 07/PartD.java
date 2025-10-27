// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer (1 - 3999): ");
        int Number = in.nextInt();

        if (Number <= 0 | Number > 3999) {
            System.out.println("Invalid input. Please enter a number between 1 and 3999.");
        } else {

            String[] Thousands = {"", "M", "MM", "MMM"};
            String[] Hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String[] Tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] Ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

            String Roman = Thousands[Number / 1000] +
                           Hundreds[(Number % 1000) / 100] +
                           Tens[(Number % 100) / 10] +
                           Ones[Number % 10];

            System.out.println("Roman numeral: " + Roman);
        }
    }
}

