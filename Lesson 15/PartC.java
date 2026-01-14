// Brennan Ziegler
// AT Software Design with Java

import java.util.Random;
import java.util.Arrays;

public class PartC {

    public static int linearSearch(int[] Array, int TgtVal) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == TgtVal) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int Size = 10000; 
        int[] Numbers = new int[Size];

        Random Rand = new Random();

        for (int i = 0; i < Size; i++) {
            Numbers[i] = Rand.nextInt(Size) + 1;
        }

        Arrays.sort(Numbers);

        for (int i = 0; i < 10; i++) {

            int Target = Rand.nextInt(Size) + 1;

            long StartLinear = System.nanoTime();
            linearSearch(Numbers, Target);
            long EndLinear = System.nanoTime();

            long StartBinary = System.nanoTime();
            Arrays.binarySearch(Numbers, Target);
            long EndBinary = System.nanoTime();

            System.out.println("Target value: " + Target);
            System.out.println("Linear search time: " + (EndLinear - StartLinear) + " ns");
            System.out.println("Binary search time: " + (EndBinary - StartBinary) + " ns");
            System.out.println();
        }
    }
}

/*  
    * With an array size of 10,000, binary search is usually faster than linear search, but the difference might not seem huge every time.
    * When you increase the size to 10,000,000, linear search becomes much slower because it may need to check millions of values.
    * Binary search stays fast because it keeps cutting the search area in half.
*/
