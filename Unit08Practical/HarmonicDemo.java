import org.derryfield.math.Algebra;

public class HarmonicDemo {
    public static void main(String[] args) {
        double val1 = 10.0;
        double val2 = 20.0;

        try {
            System.out.println("Calculating Harmonic Mean for " + val1 + " and " + val2 + "...");
            
            double result = Algebra.getHarmonicMean(val1, val2);
            
            System.out.printf("The Harmonic Mean is: %.2f%n", result);
            
            System.out.println("\nTesting with an invalid value (-5)...");
            Algebra.getHarmonicMean(10, -5);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
