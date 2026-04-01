public class ExecutiveTwo extends ManagerTwo {
    private double shares;

    public ExecutiveTwo(String name, double salary, double bonus, double shares) {
        super(name, salary, bonus);
        this.shares = shares;
    }

    public double getShares() {
        return shares;
    }

    public void setShares(double shares) {
        this.shares = shares;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Shares = %,12.2f%n", shares);
    }
}
