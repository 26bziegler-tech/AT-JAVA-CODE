import java.util.Scanner;

public class DoLoop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double amount = 0;
        double total = 0;

        do {
            System.out.print("Enter a dollar amount ($): ");

            if (!in.hasNextDouble()) {
                System.out.println("Error: Non-numeric value. Please try again.");
                in.next();
                continue;
            }

            amount = in.nextDouble();

            if (amount < 0) {
                System.out.println("Error: Amount cannot be negative. Please try again.");
                continue;
            }

            total += amount;
            System.out.println("Current total: $" + total);

        } while (true);
    }
}

