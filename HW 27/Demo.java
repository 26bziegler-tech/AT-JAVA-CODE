import java.util.Scanner;
import org.derryfield.math.Geometry;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the length of the side of the square: ");
        double Side = in.nextDouble();
        
        double Perimeter = Geometry.get_perimeter_square(Side);
        double Area = Geometry.get_area_square(Side);
        
        System.out.println("Perimeter: " + Perimeter);
        System.out.println("Area: " + Area);
        
        in.close();
    }
}
