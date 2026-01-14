// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] Values = new int[20];
        int Size = 0;

        while (Size < 20) {
            System.out.print("Enter an integer value or 'q' to quit: ");

            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next(); 
                break;
            } else {
                Values[Size] = in.nextInt();
                Size++;
            }
        }

        for (int i = 0; i < Size; i++) {
            System.out.print(Values[i]);
            if (i < Size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Enter a target integer value: ");
        int Target = in.nextInt();

        int Count = 0;
        for (int i = 0; i < Size; i++) {
            if (Values[i] == Target) {
                Count++;
            }
        }

        System.out.println(
            "The value " + Target + " occurs " + Count + " times in your original data set."
        );
    }
}
