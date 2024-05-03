package Build;

public class FisherShip implements ShipsInterface {
    private final int fisherLength;
    private int potency;
    private int fisherNumber;

    public FisherShip(int fisherLength, int potency, int fisherNumber) {
        this.fisherLength = fisherLength;
        this.potency = potency;
        this.fisherNumber = fisherNumber;

        System.out.println("A Fisher Ship has been created");
    }

    @Override
    public void alarm() {
        System.out.println("Fisher Ship Alarm");
        System.out.println("Fish bank ahead!!");
    }

    @Override
    public void rescueMessage(String message) {
        System.out.println("SOS " + message);
    }

    // Getters and Setters
    public int getFisherLength() {
        return fisherLength;
    }

    public int getPotency() {
        return potency;
    }

    public void setPotency(int potency) {
        this.potency = potency;
    }

    public int getFisherNumber() {
        return fisherNumber;
    }

    public void setFisherNumber(int fisherNumber) {
        this.fisherNumber = fisherNumber;
    }

}
