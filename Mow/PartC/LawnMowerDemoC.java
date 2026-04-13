package mow;

import java.util.Scanner;

public class LawnMowerDemoC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter lawn height: ");
        int h = in.nextInt();
        System.out.print("Enter lawn width: ");
        int w = in.nextInt();

        YardC myYard = new YardC(h, w);
        MowerC myMower = new MowerC();
        
        myMower.randomize(myYard);

        boolean workToDo = true;
        while (workToDo) {
            clearScreen();
            myYard.print(myMower);
            delay(300);
            
            workToDo = myMower.updateMower(myYard);
        }

        clearScreen();
        myYard.print(myMower);
        System.out.println("Mowing Complete!");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long ms) {
        try { Thread.sleep(ms); } catch (Exception e) {}
    }
}
