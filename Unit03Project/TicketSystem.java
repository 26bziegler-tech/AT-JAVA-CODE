// Brennan Ziegler
// AT Software Design With JAVA

/* For this assignment I consulted with AI to provide me with standard examples of specific code
 * in order to try and incorporate new things to make the assignment work
 */

import java.util.Scanner;

public class TicketSystem {

    enum CustomerType {
        BABY, CHILD, ADULT, SENIOR
    }

    enum DayofWeek {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Name (First Last): ");
        String Name = in.nextLine().trim();

        System.out.print("Day of Week: ");
        String DayIn = in.nextLine().trim().toLowerCase();

        DayofWeek Day = null;
        if (DayIn.length() >= 3) {
            String FirstThree = DayIn.substring(0, 3);
            if (FirstThree.equals("mon")) Day = DayofWeek.MON;
            else if (FirstThree.equals("tue")) Day = DayofWeek.TUE;
            else if (FirstThree.equals("wed")) Day = DayofWeek.WED;
            else if (FirstThree.equals("thu")) Day = DayofWeek.THU;
            else if (FirstThree.equals("fri")) Day = DayofWeek.FRI;
            else if (FirstThree.equals("sat")) Day = DayofWeek.SAT;
            else if (FirstThree.equals("sun")) Day = DayofWeek.SUN;
        }

        if (Day == null) {
            System.err.println("Error: Unknown day");
            return;
        }

        System.out.print("Time 24-hour format (06:45): ");
        String Time = in.nextLine().trim();
        int Colon = Time.indexOf(':');
        if (Colon == -1) {
            System.err.println("Error: Invalid format");
            return;
        }

        String HourIn = Time.substring(0, Colon);
        String MinuteIn = Time.substring(Colon + 1);

        int Hour = Integer.parseInt(HourIn);
        int Minute = Integer.parseInt(MinuteIn);

        if (Hour < 0 || Hour > 23 || Minute < 0 || Minute > 59) {
            System.err.println("Error: Invalid time");
            return;
        }

        boolean rushHour = (Hour >= 6 && Hour <= 7) || (Hour >= 16 && Hour <= 17);
        double InitialCost;
        String FareType;

        if (Day == DayofWeek.SAT || Day == DayofWeek.SUN) {
            InitialCost = 80.00;
            FareType = "(WEEKEND FARE)";
        } else if (rushHour) {
            InitialCost = 100.00;
            FareType = "(RUSH HOUR FARE)";
        } else {
            InitialCost = 90.00;
            FareType = "(STANDARD FARE)";
        }

        System.out.print("Age: ");
        boolean hasAge = in.hasNextInt();
        if (hasAge == false) {
            System.err.println("Error: Age must be a number");
            return;
        }

        int Age = in.nextInt();

        CustomerType Type;
        if (Age <= 2) Type = CustomerType.BABY;
        else if (Age <= 12) Type = CustomerType.CHILD;
        else if (Age <= 59) Type = CustomerType.ADULT;
        else Type = CustomerType.SENIOR;

        System.out.print("Student (y/n)?: ");
        String StudentIn = in.next().trim().toLowerCase();

        boolean Student;
        if (StudentIn.equals("y")) {
            Student = true;
        } else if (StudentIn.equals("n")) {
            Student = false;
        } else {
            System.err.println("Error: Invalid input");
            return;
        }

        double AgeDiscount = 0;
        double StudentDiscount = 0;
        double FinalCost = 0;

        if (Type == CustomerType.BABY) {
            FinalCost = 0;
            InitialCost = 0;
            FareType = "(BABY - FREE)";
        } else {
            if (Type == CustomerType.CHILD) {
                AgeDiscount = InitialCost * 0.20;
            } else if (Type == CustomerType.SENIOR) {
                AgeDiscount = InitialCost * 0.25;
            }

            double AfterAgeDiscount = InitialCost - AgeDiscount;

            if (Student) {
                StudentDiscount = AfterAgeDiscount * 0.05;
            }

            FinalCost = AfterAgeDiscount - StudentDiscount;
        }

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.printf("Name:    %s%n", Name);
        System.out.printf("Day:     %s%n", Day);
        System.out.printf("Time:    %s%n", Time);
        System.out.println("------------------------------------------------------");
        System.out.printf("Base Price:         $%8.2f %s%n", InitialCost, FareType);
        System.out.printf("Age Discount:       $%8.2f (%s)%n", -AgeDiscount, Type);
        System.out.printf("Student Discount:   $%8.2f%n", -StudentDiscount);
        System.out.println("------------------------------------------------------");
        System.out.printf("Final Cost:         $%8.2f%n", FinalCost);
        System.out.println("------------------------------------------------------");
    }
}
