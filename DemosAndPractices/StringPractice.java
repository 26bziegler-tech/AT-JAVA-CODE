public class StringPractice {
    public static void main(String[] args) {
        String name = "Brennan";
        System.out.println("Your name is " + name);
        System.out.println("Shouting Name: " + name.toUpperCase());

        int length = name.length();
        System.out.println("length = " + length);
        System.out.println("First letter = " + name.charAt(0));
        System.out.println("Last letter = " + name.charAt(length - 1));

        String fname = "Brennan";
        String lname = "Ziegler";
        System.out.println("Full Name: " + fname + " " + lname);
    }
}
