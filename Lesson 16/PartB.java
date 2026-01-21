// Brennan Ziegler
// AT Software Design with Java

import java.util.Arrays;

public class PartB {

    public static void main(String[] args) {

        double Avg1 = average(10, 8, 9);
        System.out.println("Average of 10, 8, 9 = " + Avg1);

        double[] Scores = {100, 90, 80, 100, 80};
        double Avg2 = average(Scores);
        System.out.println("Average of scores array = " + Avg2);

        double[] TestScores = new double[10];
        int Size = 5;

        TestScores[0] = 100;
        TestScores[1] = 90;
        TestScores[2] = 80;
        TestScores[3] = 100;
        TestScores[4] = 80;

        double[] ValidScores = Arrays.copyOf(TestScores, Size);

        double Avg3 = average(ValidScores);
        System.out.println("Average of partially filled array = " + Avg3);
    }

    public static double average(double... Values) {
        double Sum = 0;

        for (int i = 0; i < Values.length; i++) {
            Sum += Values[i];
        }

        return Sum / Values.length;
    }
}
