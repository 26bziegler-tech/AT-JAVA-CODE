import java.time.LocalDate;
import java.time.LocalTime;

public class PartA {
    public static void main(String[] args) {
        LocalDate Date = LocalDate.now();
        LocalTime Time = LocalTime.now();

        System.out.println("Today's date is " + Date);
        System.out.println("The time is " + Time);
    }
}