// Brennan Ziegler
// AT Software Design with Java

package mow;

import java.util.Scanner;

public class LawnMowerDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        clearScreen();

        System.out.print("Enter the height of the lawn: ");
        int h = input.nextInt();
        System.out.print("Enter the width of the lawn: ");
        int w = input.nextInt();

        Yard myYard = new Yard(h, w);

        myYard.print();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
    }
}