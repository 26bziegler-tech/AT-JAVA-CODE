import java.util.Scanner; 

public class Product {

    public static double CalculateProduct(double x, double y) {
        double value = x * y;
        return value;
    }

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    
    System.out.print("Please enter a number: ");
    double x = in.nextDouble();

    System.out.print("Please enter another number: ");
    double y = in.nextDouble();

    double product = CalculateProduct(x, y);

    System.out.println("The product of these numbers equals: " + product);
    }  
}
