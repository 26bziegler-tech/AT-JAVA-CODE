// Brennan Ziegler
// AT Software Design with Java
public class Volume1 {
    public static void main(String[] args) {
        int cansPerPack = 6;
        // Volume In Liters of a Single Can of Soda
        double CAN_VOLUME = 0.355;
        double VolumeOfPack = cansPerPack * CAN_VOLUME;
        System.out.println("The Total Volume of a 6 Pack of Cans Is: " + VolumeOfPack + " Liters");
        // Volume In Liters of a Single Bottle of Soda
        int BOTTLE_VOLUME = 2;
        double PackPlusBottle = BOTTLE_VOLUME + VolumeOfPack;
        System.out.println(
                "The Total Volume of a 6 Pack of Cans Plus a Bottle of Soda Is: " + PackPlusBottle + " Liters");
    }
    
}
