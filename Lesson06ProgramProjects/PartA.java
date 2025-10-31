// Brennan Ziegler
// AT Software Design With JAVA

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature and a 'C' for Celsius or 'F' for Fahrenheit (Ex: 31 F): ");
        double Temperature = in.nextDouble();
        char Scale = in.next().toUpperCase().charAt(0);

        double TempCelsius = 0;

        if (Scale == 'F') {
            TempCelsius = (Temperature - 32) * 5 / 9;
        } else if (Scale == 'C') {
            TempCelsius = Temperature;
        } 

        String State;
        if (TempCelsius <= 0) {
            State = "Solid (ice)";
        } else if (TempCelsius >= 100) {
            State = "Gaseous (steam)";
        } else {
            State = "Liquid (water)";
        }

        System.out.printf("At a temperature of %.2f %c, water is in a %s state.%n", Temperature, Scale, State);
    }
}
