import java.util.Scanner;

public class TemperatureAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Sum = 0;
        int Count = 0;

        System.out.println("Enter Fahrenheit temperature readings (or 'q' to quit)");

        while (true) {
            System.out.print("Enter temperature: ");
            String Input = in.nextLine();

            if (Input.equals("q")) {
                break;
            }

            try {
                double Temperature = Double.parseDouble(Input); 
                Sum += Temperature; 
                Count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q' to quit.");
            }
        }

        if (Count > 0) {
            double Average = Sum / Count;
            System.out.printf("Average Fahrenheit temperature: %.2f%n", Average);
        } else {
            System.out.println("No temperature readings were entered");
        }
    }
}