// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

class Counter {
    private int Value = 0;

    public void click() {
        Value++;
    }

    public int getValue() {
        return Value;
    }
}

public class PartB {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Counter CakeCounter = new Counter();
        Counter PieCounter = new Counter();
        
        char Input = ' ';

        while (Input != 'q') {
            System.out.print("Enter 'c' for cake, 'p' for pie, or 'q' to quit: ");
            
            String Response = in.next().toLowerCase();
            Input = Response.charAt(0);

            if (Input == 'c') {
                CakeCounter.click();
            } else if (Input == 'p') {
                PieCounter.click();
            }
        }

        System.out.println("Total votes for Cake: " + CakeCounter.getValue());
        System.out.println("Total votes for Pie: " + PieCounter.getValue());
        
        in.close();
    }
}