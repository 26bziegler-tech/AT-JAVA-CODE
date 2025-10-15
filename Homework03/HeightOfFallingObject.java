// Brennan Ziegler
// AT Software Design with Java

import java.util.Scanner;

public class HeightOfFallingObject {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double GRAVITY = -9.81;
        System.out.print("What is the initial height of the object in meters?: ");
        double HeightInitial = in.nextDouble();
        System.out.print("What is the initial velocity of the object in m/s?: ");
        double VelocityInitial = in.nextDouble();
        System.out.print("For how many seconds does the object fall?: ");
        double Time = in.nextDouble();

        double HeightFinal = HeightInitial + (VelocityInitial*Time) + (0.5*GRAVITY*(Time*Time));

        System.out.println("The height of the falling object after " + Time + " seconds is: " + HeightFinal + " meters");
    }
}
