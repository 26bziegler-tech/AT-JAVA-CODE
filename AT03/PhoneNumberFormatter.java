// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class PhoneNumberFormatter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 10 digit phone number (no spaces): ");

        String UnformattedNumber = scanner.next();

        String AreaCode = UnformattedNumber.substring(0, 3);   
        String Prefix = UnformattedNumber.substring(3, 6);      
        String LineNumber = UnformattedNumber.substring(6, 10); 

        String FormattedNumber = "(" + AreaCode + ") " + Prefix + "-" + LineNumber;

        System.out.println("The formatted number is " + FormattedNumber);
    }
}