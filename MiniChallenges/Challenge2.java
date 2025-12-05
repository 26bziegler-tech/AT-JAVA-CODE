// Brennan Ziegler
// AT Software Design with Java

import java.util.Random;

public class Challenge2 {

    public static void main(String[] args) {
        Random rand = new Random();

        int d1, d2;

        do {
            d1 = rand.nextInt(6) + 1;
            d2 = rand.nextInt(6) + 1;

            System.out.println("Roll:");
            printDie(d1);
            printDie(d2);
            System.out.println();

        } while (d1 != d2);

        System.out.println("Both dice matched. Stopping.");
    }

    public static void printDie(int num) {
        String[][] faces = {
            {},
            { "     ",
              "  o  ",
              "     " },
            { "o    ",
              "     ",
              "    o" },
            { "o    ",
              "  o  ",
              "    o" },
            { "o   o",
              "     ",
              "o   o" },
            { "o   o",
              "  o  ",
              "o   o" },
            { "o   o",
              "o   o",
              "o   o" }
        };

        System.out.println("+-------+");
        for (String line : faces[num]) {
            System.out.println("| " + line + " |");
        }
        System.out.println("+-------+");
    }
}

