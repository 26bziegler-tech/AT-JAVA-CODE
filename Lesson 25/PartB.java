// Brennan Ziegler
// AT Software Design with Java

// I consulted AI for portions of this

import java.util.ArrayList;
import java.util.Scanner;

class CashRegister {
    private ArrayList<Double> Items;

    public CashRegister() {
        Items = new ArrayList<Double>();
    }

    public void addItem(double Price) {
        Items.add(Price);
    }

    public void removeItem() {
        if (!Items.isEmpty()) {
            Items.remove(Items.size() - 1);
        } else {
            System.out.println("Error: No items to remove.");
        }
    }

    public double getTotal() {
        double Total = 0;
        for (double Price : Items) {
            Total += Price;
        }
        return Total;
    }

    public int getCount() {
        return Items.size();
    }

    public void clear() {
        Items.clear();
    }
}

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CashRegister Register = new CashRegister();
        boolean KeepRunning = true;

        System.out.println("--- Interactive Cash Register ---");
        System.out.println("Commands:");
        System.out.println("  (number) : Add item price");
        System.out.println("  't'      : Display total and count");
        System.out.println("  'd'      : Delete most recent entry");
        System.out.println("  'c'      : Clear all entries");
        System.out.println("  'q'      : Quit");
        System.out.println("---------------------------------");

        while (KeepRunning) {
            System.out.print("> ");
            String Input = in.next().toLowerCase();

            switch (Input) {
                case "q":
                    KeepRunning = false;
                    System.out.println("Closing register.");
                    break;

                case "t":
                    System.out.printf("Current Total: $%.2f (%d items)\n", 
                                      Register.getTotal(), Register.getCount());
                    break;

                case "d":
                    Register.removeItem();
                    System.out.println("Last item removed.");
                    break;

                case "c":
                    Register.clear();
                    System.out.println("Register cleared.");
                    break;

                default:
                    try {
                        double Price = Double.parseDouble(Input);
                        if (Price < 0) {
                            System.out.println("Error: Price cannot be negative.");
                        } else {
                            Register.addItem(Price);
                            System.out.printf("Added: $%.2f\n", Price);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Use a number or commands (t, d, c, q).");
                    }
                    break;
            }
        }
        in.close();
    }
}
