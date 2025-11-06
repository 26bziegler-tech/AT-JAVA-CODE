// Brennan Ziegler
// AT Software Design With JAVA

import java.util.Random;

public class PartC {
    public static void main(String[] args) {
        Random Rand = new Random();

        int Total = 0;
        int Count = 10;

        System.out.println("Generating 10 random integers between 1 and 10:");

        for (int i = 0; i < Count; i++) {
            int Num = Rand.nextInt(10) + 1; 
            System.out.print(Num + " ");
            Total += Num;
        }

        double Average = (double) Total / Count;
        System.out.printf("\nAverage of 10 numbers: %.2f\n", Average);

        Total = 0;
        Count = 1000;

        for (int i = 0; i < Count; i++) {
            int Num = Rand.nextInt(10) + 1;
            Total += Num;
        }

        double LargeAverage = (double) Total / Count;
        System.out.printf("Average of 1000 numbers: %.2f\n", LargeAverage);

        System.out.println("\nExplanation:");
        System.out.println("As more random numbers are generated, "
                + "the average gets closer to 5.5 because "
                + "that is the middle of the range 1–10.");
    }
}
