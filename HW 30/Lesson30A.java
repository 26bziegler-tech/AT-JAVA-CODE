import java.util.ArrayList;
import java.util.Scanner;

public class Lesson30A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<EmployeeTwo> employees = new ArrayList<>();
        
        while (true) {
            System.out.print("Enter a letter ((E)mployee, (M)anager, (X)ecutive, or (Q)uit): ");
            String choice = in.nextLine().toLowerCase();
            
            if (choice.equals("q")) {
                break;
            }

            System.out.print("Enter name: ");
            String name = in.nextLine();
            System.out.print("Enter salary (as a double): ");
            double salary = Double.parseDouble(in.nextLine());

            if (choice.equals("e")) {
                employees.add(new EmployeeTwo(name, salary));
            } else if (choice.equals("m")) {
                System.out.print("Enter bonus (as a double): ");
                double bonus = Double.parseDouble(in.nextLine());
                employees.add(new ManagerTwo(name, salary, bonus));
            } else if (choice.equals("x")) {
                System.out.print("Enter bonus (as a double): ");
                double bonus = Double.parseDouble(in.nextLine());
                System.out.print("Enter shares (as a double): ");
                double shares = Double.parseDouble(in.nextLine());
                employees.add(new ExecutiveTwo(name, salary, bonus, shares));
            } else {
                System.out.println("I don't understand your choice.");
            }
            System.out.println();
        }

        System.out.println("\nYour company has " + employees.size() + " employees.\n");

        for (EmployeeTwo employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}