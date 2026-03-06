/*
 * PART C: OBJECT REFERENCES AND ALIASING
 * 1. OUTPUT:
 * 150.0
 * 150.0
 * 2. WHY:
 * The line 'Customer c2 = c1;' does not create a new Customer object. 
 * It creates a second reference (an "alias") that points to the 
 * exact same memory location as c1. 
 * When 'c2.addSale(50)' is called, it modifies the 'totalSales' field of 
 * the object shared by both variables. When you 
 * call 'getSales()' on either c1 or c2, they both report the same 
 * accumulated total of 150.0.
 * 3. COMPLETED CUSTOMER CLASS:
 */

class Customer {
    public static int LastSerialUsed;
    
    private String Name;
    private double TotalSales;

    public Customer(String Name) {
        this.Name = Name;
        this.TotalSales = 0.0;
    }

    public void addSale(double Amount) {
        this.TotalSales += Amount;
    }

    public double getSales() {
        return TotalSales;
    }
}

public class PartC {
    public static void main(String[] args) {
        Customer.LastSerialUsed = 100;
        Customer c1 = new Customer("Sal's Deli");
        c1.addSale(100);
        
        Customer c2 = c1; 
        c2.addSale(50);  
        
        System.out.println(c1.getSales());
        System.out.println(c2.getSales()); 
    }
}