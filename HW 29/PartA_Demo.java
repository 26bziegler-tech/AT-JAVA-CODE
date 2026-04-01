public class PartA_Demo {
    public static void main(String[] args) {
        Bicycle standardBike = new Bicycle();
        GearedBicycle gearedBike = new GearedBicycle();

        for (int i = 0; i < 10; i++) {
            standardBike.pedal();
            gearedBike.pedal();
        }

        System.out.println("--- Braking Comparison Test ---");
        System.out.println("Initial Speed - Standard: " + standardBike.getSpeed() + ", Geared: " + gearedBike.getSpeed());

        standardBike.brake();
        gearedBike.brake();

        System.out.println("After 1 Brake - Standard: " + standardBike.getSpeed() + " (decreased by 1)");
        System.out.println("After 1 Brake - Geared:   " + gearedBike.getSpeed() + " (decreased by 2)");
    }
}