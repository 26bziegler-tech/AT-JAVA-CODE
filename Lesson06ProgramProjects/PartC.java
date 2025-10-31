// Brennan Ziegler
// AT Software Design With JAVA

import java.util.Scanner;
import java.util.Arrays;

public class PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three strings: ");
        String String1 = in.next();
        String String2 = in.next();
        String String3 = in.next();

        String[] Words = {String1, String2, String3};

        Arrays.sort(Words);

         for (String Word : Words) {
            System.out.println(Word);
        }
    }
}
