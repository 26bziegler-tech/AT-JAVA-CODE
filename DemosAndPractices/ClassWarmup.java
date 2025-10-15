import java.util.Scanner;

public class ClassWarmup {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");

        int length = name.length();

        System.out.println(name + ", your name has " + length + " letters in it!");

        System.out.print("Enter a number: ");
        double x = in.nextDouble();

        System.out.print("Enter another number: ");
        double y = in.nextDouble();

        System.out.printf("The quotient of your numbers is %.2f%n", x / y);
    }
}
