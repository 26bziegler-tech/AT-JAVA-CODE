// Brennan Ziegler
// AT Software Design With JAVA

import java.util.Scanner; 

public class PartC {

    public static double CalculateSphereVolume(double Radius) {
        double Volume = (4.0 / 3.0) * Math.PI * Math.pow(Radius, 3);
        return Volume;
    }
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the radius of the sphere (double): ");
        
        if (in.hasNextDouble()) {
            double r = in.nextDouble();
            
            if (r >= 0) {

                double SphereVolume = CalculateSphereVolume(r); 
              
                System.out.printf("A sphere with a radius of %.2f has a volume of: %.2f%n", r, SphereVolume);
            } else {
                System.out.println("Radius cannot be negative");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid double value for the radius.");
        }
    }
}