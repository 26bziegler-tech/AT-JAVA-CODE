// Brennan Ziegler
// AT Software Design With JAVA

/* The reason when the original code is run it gives the output of "c is not 3.6" which 
   is not the expected output, is because of the way that floating point multiplication 
   works, so 3 multiplied by 1.2 is actually 3.5999999 which doesn't match with the 
   value to make the first output true, so therefore you have to add a tolerance factor */

public class PartC {
    public static void main(String[] args) {
    
    double a = 1.2; 
    double b= 3.0;
    double c = a * b;
    
    if((c - 3.6) < 0.00000000000001) {
        System.out.println("c is 3.6");
    } else {
        System.out.println("c is not 3.6");
    }
    }
}
