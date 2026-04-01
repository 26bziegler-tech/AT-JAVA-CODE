public class PartB_Demo {
    public static void main(String[] args) {
        Employee staff = new Employee("Brennan Ziegler", 50000.0);
        
        Manager boss = new Manager("Thomas Eng", 75000.0, 15000.0);

        System.out.println("--- Payroll Report ---");
        
        System.out.println("Employee: " + staff.getName());
        System.out.println("Income:   $" + staff.getAnnualIncome());
        
        System.out.println("-----------------------");
        
        System.out.println("Manager:  " + boss.getName());
        System.out.println("Income:   $" + boss.getAnnualIncome() + " (Salary + Bonus)");
    }
}