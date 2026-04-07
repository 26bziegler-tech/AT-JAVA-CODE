// Brennan Ziegler
// AT Software Design with Java

package mow;

import java.util.Scanner;

public class LawnMowerDemoB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        clearScreen();

        System.out.print("Enter the height of the lawn: ");
        int h = in.nextInt();
        System.out.print("Enter the width of the lawn: ");
        int w = in.nextInt();

        YardB myYard = new YardB(h, w);
        MowerB myMower = new MowerB(1, 1, 1);

        
        while (myMower.sense(myYard) == '+') {
            clearScreen();
            myMower.cut(myYard);
            myYard.print(myMower);
            delay(500); 
            myMower.moveForward();
        }

        clearScreen();
        myMower.cut(myYard);
        myYard.print(myMower);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }
}