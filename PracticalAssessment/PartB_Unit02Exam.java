// Brennan Ziegler
// AT Software Design With JAVA

import java.util.Scanner;

public class PartB_Unit02Exam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int TOTAL_SEATS = 12;

        System.out.print("Enter your current seat number (0-11): ");
        int CurrentSeat = in.nextInt();

        System.out.print("Enter the number of seats to shift by: ");
        int Shift = in.nextInt();

        int FinalSeat = (CurrentSeat + Shift) % TOTAL_SEATS;

        System.out.println("You will end up in seat: " + FinalSeat);
    }
}
