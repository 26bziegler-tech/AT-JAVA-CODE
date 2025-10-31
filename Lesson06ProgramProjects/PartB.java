// Brennan Ziegler
// AT Software Design With JAVA

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two floating point numbers: ");
        double Num1 = in.nextDouble();
        double Num2 = in.nextDouble();


        Num1 = Math.round(Num1 * 100.0) / 100.0;
        Num2 = Math.round(Num2 * 100.0) / 100.0;

        if (Num1 == Num2) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
    }
}

