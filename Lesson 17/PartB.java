// Brennan Ziegler
// AT Software Design with Java

public class PartB {

    public static void main(String[] args) {

        int[][] FirstArray = {
            {8, 6, 7},
            {5, 3, 0}
        };

        int[][] SecondArray = {
            {0, 7, 6, 5},
            {2, 2, 0, 1},
            {8, 4, 5, 7}
        };

        System.out.println("First array:");
        print(FirstArray);

        System.out.println();
        System.out.println("Second array:");
        print(secondArray);
    }

    public static void print(int[][] Values) {

        for (int Row = 0; Row < Values.length; Row++) {
            System.out.print("  ");
            for (int Col = 0; Col < Values[Row].length; Col++) {
                System.out.print(Values[Row][Col]);
                if (Col < Values[Row].length - 1) {
                    System.out.print(",  ");
                }
            }
            System.out.println();
        }
    }
}
