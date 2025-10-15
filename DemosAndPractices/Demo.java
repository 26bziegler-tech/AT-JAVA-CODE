public class Demo {
    public static void main(String[] args) {
        
        System.out.println("This is a double quote: \"");
        System.out.println("This is a backslash: \\");
        System.out.println("This is a new line: line #1\nline #2");
       
        char c = 'b';
        System.out.println(c);
        System.out.println((int) c);
        
        String name = "Brennan";
        char start = name.charAt(0);
        char last = name.charAt(6);
        System.out.println("The name is: " + name + "\nThe first letter is: " + start + "\nThe last letter is: " + last);
    }
}