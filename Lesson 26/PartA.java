/*
 * 1. Java-provided constant: Math.PI (Used for circle-related calculations)
 * 2. Java-provided static method: Math.sqrt() (Used to find the square root of a number)
 */

public class PartA {
    public static void main(String[] args) {
        
        double Radius = 5.0;
        double Area = Math.PI * (Radius * Radius);
        
        double Number = 25.0;
        double SquareRoot = Math.sqrt(Number);

        System.out.println("Circle Area using Math.PI: " + Area);
        System.out.println("Square root of " + Number + " using Math.sqrt: " + SquareRoot);
    }
}