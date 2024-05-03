package Build;

public class CruiseShip implements ShipsInterface {
    private final int cruiseLength;
    private static int occupiedBeds;

    public CruiseShip(int cruiseLength) {
        this.cruiseLength = cruiseLength;
        System.out.println("A Cruise Ship has been created");
    }

    public static String increaseOccupiedBeds (int usedBeds) {
        occupiedBeds += usedBeds;
        return "A total of: " + occupiedBeds + " beds are being used";
    }
    @Override
    public void alarm() {
        System.out.println("Cruise Ship Alarm");
        System.out.println("Beep beep beep");
        System.out.println("Jump!");
    }

    @Override
    public void rescueMessage(String message) {
        alarm();
        System.out.println("SOS" + message);
    }

    // Getters and Setters
    public int getCruiseLength() {
        return cruiseLength;
    }

    public static int setOccupiedBeds(int occupiedBeds) {
        return occupiedBeds += occupiedBeds;
    }
    public static int getOccupiedBeds() {
        return occupiedBeds;
    }
}
