// Brennan Ziegler
// AT Software Design with Java

public class PartD {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            for (int d = 1; d <= 5 - row; d++) {
                System.out.print(".");
            }

            for (int n = 1; n <= row; n++) {
                System.out.print(row);
            }

            System.out.println();
        }
    }
}

