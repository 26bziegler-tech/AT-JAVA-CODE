import MyStuff.Random;

public class DemoApp {
    public static void main(String[] args) {
        int MaxRange = 100;
        
        System.out.println("Here are 5 randomly generated numbers from 1 to " + MaxRange + ":");
        
        for (int i = 0; i < 5; i++) {
            int Result = Random.getRandomInteger(MaxRange);
            System.out.println(Result);
        }
        
        System.out.println("Goodbye!");
    }
}