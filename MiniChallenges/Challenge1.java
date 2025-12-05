// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = in.nextLine();

        String cleaned = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                ch = Character.toLowerCase(ch);
                cleaned = cleaned + ch;
            }
        }

        boolean IsPalindrome = true;

        for (int i = 0; i < cleaned.length() / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(cleaned.length() - 1 - i)) {
                IsPalindrome = false;
                break;
            }
        }

        if (IsPalindrome) {
            System.out.println("That is a palindrome");
        } else {
            System.out.println("That is not a palindrome");
        }
    }
}

