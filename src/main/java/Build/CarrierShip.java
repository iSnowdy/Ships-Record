package Build;

public class CarrierShip implements ShipsInterface {
    private int planeNumber;
    private int marinesNumber;

    public CarrierShip(int planeNumber, int marinesNumber) {
        this.planeNumber = planeNumber;
        this.marinesNumber = marinesNumber;

        System.out.println("A Carrier Ship has been created");
    }
    @Override
    public void alarm() {
        System.out.println("Carrier Ship Alarm");
        System.out.println("Everyone to their positions!");
    }
    // Getters and Setters
    @Override
    public void rescueMessage(String message) {
        alarm();
        System.out.println("SOS " + message);
    }

    public int getPlaneNumber() {
        return planeNumber;
    }

    public void setPlaneNumber(int planeNumber) {
        this.planeNumber = planeNumber;
    }

    public int getMarinesNumber() {
        return marinesNumber;
    }

    public void setMarinesNumber(int marinesNumber) {
        this.marinesNumber = marinesNumber;
    }
}
