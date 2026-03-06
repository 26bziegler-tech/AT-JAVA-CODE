/*
 * PART B
 * 1. WHAT IS THE OUTPUT?
 * Before: 0
 * After: 0
 * 2. WHY? 
 * In the method 'setValue(int value)', the parameter name is identical 
 * to the instance variable name ('value'). 
 * Inside the method Java prioritizes the local.
 * The line 'value = value;' simply assigns the parameter to itself and 
 * never updates the actual object's field.
 * 3. THE FIX:
 * Use the 'this' keyword to tell Java you want to update the 
 * instance variable belonging to the object, not the local parameter.
 */

class Item {
    private int Value;

    public void setValue(int Value) {
        this.Value = Value; 
    }

    public int getValue() {
        return Value;
    }
}

public class PartB {
    public static void main(String[] args) {
        Item MyItem = new Item();
    
        System.out.println("Before: " + MyItem.getValue());
        
        MyItem.setValue(13);
        
        System.out.println("After: " + MyItem.getValue());
    }
}