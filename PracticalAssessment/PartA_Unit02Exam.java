// Brennan Ziegler
// AT Software Design With JAVA

import java.util.Scanner;

public class PartA_Unit02Exam {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String Name = in.nextLine();

        System.out.print("\nHello, " + Name + "! Enter two amounts ($): ");

        double Amount1 = in.nextDouble();
        
        double Amount2 = in.nextDouble();
        
        in.nextLine();
        
        double Average = (Amount1 + Amount2) / 2.0;

        System.out.printf("\n%-10s $%8.2f%n", "Amount #1:", Amount1);
        
        System.out.printf("%-10s $%8.2f%n", "Amount #2:", Amount2);
        
        System.out.printf("%-10s $%8.2f%n", "Average:", Average);
    }
}