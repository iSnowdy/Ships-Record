package Build;

public record CruiseShip(int cruiseLength) implements ShipsInterface {
    private static int occupiedBeds;

    // Record class are a special type of class that its parameters cannot be modified once initiated
    // Since this class only takes in one parameter, and that parameter is a final, it can be declared
    // as a record class
    public CruiseShip(int cruiseLength) {
        this.cruiseLength = cruiseLength;
        System.out.println("A Cruise Ship has been created");
    }

    public static String increaseOccupiedBeds(int usedBeds) {
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

    public static int setOccupiedBeds(int occupiedBeds) {
        return occupiedBeds += occupiedBeds;
    }

    public static int getOccupiedBeds() {
        return occupiedBeds;
    }
}
