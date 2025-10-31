// Brennan Ziegler
// AT Software Design With JAVA

public class PartA {
    public static void main(String[] args) {
        double Material = 100.0;  
        int Years = 0;

        while (Material > 1.0) {
            Material /= 2;    
            Years += 30;       
        }

        System.out.println("Years required: " + Years);
        System.out.printf("Material remaining: %.6f%%\n", Material);
    }
}

