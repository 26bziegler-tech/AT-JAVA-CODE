import java.util.Scanner;

public class LuckyAge {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if (age == 13) {
            System.out.println("Lucky 13!");
        }
    }
}
