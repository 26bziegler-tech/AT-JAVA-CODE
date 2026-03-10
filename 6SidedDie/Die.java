public class Die {
    private int Value;

    public Die() {
        Value = 1;
    }

    public Die(int initialValue) {
        Value = initialValue;
    }

    public void roll() {
        Value = (int)(Math.random() * 6) + 1;
        System.out.println("die was rolled. value = " + Value);
    }

    public void display() {
        
        if (Value == 1) {
            System.out.println("+-------+");
            System.out.println("|       |");
            System.out.println("|   0   |");
            System.out.println("|       |");
            System.out.println("+-------+");
        } else if (Value == 2) {
            System.out.println("+-------+");
            System.out.println("| 0     |");
            System.out.println("|       |");
            System.out.println("|     0 |");
            System.out.println("+-------+");
        } else if (Value == 3) {
            System.out.println("+-------+");
            System.out.println("| 0     |");
            System.out.println("|   0   |");
            System.out.println("|     0 |");
            System.out.println("+-------+");
        } else if (Value == 4) {
            System.out.println("+-------+");
            System.out.println("| 0   0 |");
            System.out.println("|       |");
            System.out.println("| 0   0 |");
            System.out.println("+-------+");
        } else if (Value == 5) {
            System.out.println("+-------+");
            System.out.println("| 0   0 |");
            System.out.println("|   0   |");
            System.out.println("| 0   0 |");
            System.out.println("+-------+");
        } else if (Value == 6) {
            System.out.println("+-------+");
            System.out.println("| 0   0 |");
            System.out.println("| 0   0 |");
            System.out.println("| 0   0 |");
            System.out.println("+-------+");
        }
    }
}