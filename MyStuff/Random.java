package MyStuff

public class Random {

    public static int getRandomInteger(int Max) {
        return (int) (Math.random() * Max) + 1;
    }
}