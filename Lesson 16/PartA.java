// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class PartA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] Words = new String[50];
        int Count = 0;

        while (true) {
            System.out.print("Enter a word or phrase or 'q' to quit: ");
            String UserInput = in.nextLine();

            if (UserInput.equals("q")) {
                break;
            }

            Words[Count] = UserInput;
            Count++;
        }

        System.out.println("Words/Phrases (current size = " + Count + "):");
        for (int i = 0; i < Count; i++) {
            System.out.println("  " + Words[i]);
        }

        cleanup(Words, Count);

        System.out.println("Modified array...");
        System.out.println("Words/Phrases (current size = " + Count + "):");
        for (int i = 0; i < Count; i++) {
            System.out.println("  " + Words[i]);
        }
    }

    public static void cleanup(String[] Arr, int Size) {
        for (int i = 0; i < Size; i++) {
            String s = Arr[i];

            s = s.trim();

            s = s.toLowerCase();

            if (s.length() > 0) {
                s = s.substring(0, 1).toUpperCase() + s.substring(1);
            }

            Arr[i] = s;
        }
    }
}

