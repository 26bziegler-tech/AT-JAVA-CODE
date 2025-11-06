// Brennan Ziegler
// AT Software Design With JAVA

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Enter a phrase: ");
        String Phrase = in.nextLine();

        int Count = 0;

        for (int i = 0; i < Phrase.length(); i++) {
            if (Phrase.charAt(i) == 'e' || Phrase.charAt(i) == 'E') {
                Count++;
            }
        }

        System.out.println("The letter 'e' appears " + Count + " times in your phrase.");
    }
}
