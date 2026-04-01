public class ManagerTwo extends EmployeeTwo {
    private double bonus;

    public ManagerTwo(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double newBonus) {
        bonus = newBonus;
    }

    @Override
    public double getAnnualIncome() {
        return super.getAnnualIncome() + getBonus();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Bonus  = $%,12.2f%n", bonus);
    }
}
