public class GearedBicycle extends Bicycle {
    
    @Override
    public void brake() {
        int newSpeed = getSpeed() - 2;
        
        if (newSpeed < 0) {
            newSpeed = 0;
        }
        
        setSpeed(newSpeed);
    }
}