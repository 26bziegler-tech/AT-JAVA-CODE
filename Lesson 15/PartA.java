// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;
import java.util.Arrays;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] Values = new int[10];
        int Size = 0;
        String Input;

        System.out.println("Enter integers (type q to quit):");

        while (Size < 10) {
            Input = in.next();

            if (Input.equals("q")) {
                break;
            }

            Values[Size] = Integer.parseInt(Input);
            Size++;
        }

        System.out.print("*");
        for (int i = 0; i < Size; i++) {
            System.out.print(Values[i] + "*");
        }
        System.out.println();

        Arrays.sort(Values, 0, Size);

        for (int i = Size - 1; i >= 0; i--) {
            System.out.print(Values[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
    }
}
