import java.util.Scanner;

public class Enumeration {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        enum DayOfWeek {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }

        System.out.print("Enter day of week (0 = Sun, 1 = Mon, etc): ");
        int d = in.nextInt();

        if (d == 0)
        System.out.println("Today is Sunday");
        else if (d == 1)
                System.out.println("Today is Monday");
        else if (d == 2)
                System.out.println("Today is Tuesday");
        else if (d == 3)
                System.out.println("Today is Wednesday");
        else if (d == 4)
                System.out.println("Today is Thursday");
        else if (d == 5)
                System.out.println("Today is Friday");
        else if (d == 6)
                System.out.println("Today is Saturday");
        else if (d == 7)
            System.out.println("Today is Sunday");
        else
            System.out.println("ERROR");
    }
}