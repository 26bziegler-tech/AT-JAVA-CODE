// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class SurfaceAreaAndVolume {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length, width, and height (cm) of the box: ");
        double length = in.nextDouble();
        double width = in.nextDouble();
        double height = in.nextDouble();

        double SurfaceArea = 2 * (length * width + length * height + width * height);
        double Volume = length * width * height;

        System.out.printf("length       (cm)   = %12.2f%n", length);
        System.out.printf("width        (cm)   = %12.2f%n", width);
        System.out.printf("height       (cm)   = %12.2f%n", height);
        System.out.printf("surface area (cm^2) = %12.2f%n", SurfaceArea);
        System.out.printf("volume       (cm^3) = %12.2f%n", Volume);
    }
}
