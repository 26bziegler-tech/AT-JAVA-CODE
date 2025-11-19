public class Test {
    public static void main(String[] args) {
        int add = 1;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int a = 1; a < 5; a++){ ;
            b = a + add;
            c = b + add;
            d = c + add;
            System.out.println("" + a + " " + b + " " + c + " " + d);
            add++;
        }
    }
}
