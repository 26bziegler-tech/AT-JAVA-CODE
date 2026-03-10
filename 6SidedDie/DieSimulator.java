import java.util.Scanner;

public class DieSimulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Die MyDie = new Die();
        String Input = "";

        System.out.println("Modeling a 6-sided Die");

        while (!Input.equals("q")) {
            System.out.print("Enter 'r' to roll, 'd' to display, or 'q' to quit: ");
            Input = in.nextLine();

            if (Input.equals("r")) {
                MyDie.roll(); 
            } 
            else if (Input.equals("d")) {
                MyDie.display(); 
            } 
            else if (Input.equals("q")) {
                System.out.println("Bye!");
            }
        }
        in.close();
    }
}