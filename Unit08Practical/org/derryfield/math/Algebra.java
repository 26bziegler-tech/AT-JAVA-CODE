package org.derryfield.math;

public class Algebra {

    public static double getHarmonicMean(double x, double y) {

        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException("Both values must be positive.");
        }
        
        if ((x + y) == 0) {
            throw new IllegalArgumentException("The sum of values cannot be zero.");
        }

        return (2 * x * y) / (x + y);
    }
}