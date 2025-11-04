import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Side 1: ");
        double Side1 = in.nextDouble();
        System.out.print("Side 2: ");
        double Side2 = in.nextDouble();
        System.out.print("Side 3: ");
        double Side3 = in.nextDouble();

        if (Side1 + Side2 > Side3 && Side2 + Side3 > Side1 && Side1 + Side3 > Side2) {
            if (Side1 == Side2 && Side2 == Side3) {
                System.out.println("Equilateral triangle");
            } else if (Side1 == Side2 || Side2 == Side3 || Side1 == Side3) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("The sides do not form a triangle");
        }
    }
}
