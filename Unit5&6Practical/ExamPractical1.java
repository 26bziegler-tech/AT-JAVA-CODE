// Brennan Ziegler
// AT Software Design with Java

import java.util.Arrays;

public class ExamPractical1  {

    public static void swap(int Index1, int Index2, int[] Arr) {

        if (Index1 >= 0 && Index1 < Arr.length && Index2 >= 0 && Index2 < Arr.length) {
            int Temp = Arr[Index1];
            Arr[Index1] = Arr[Index2];
            Arr[Index2] = Temp;
        }
    }

    public static void main(String[] args) {
        int[] Numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        swap(2, 7, Numbers);
        System.out.println(Arrays.toString(Numbers));
    }
}
