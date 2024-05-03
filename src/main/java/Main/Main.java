package Main;

import Build.CarrierShip;
import Build.FisherShip;
import Build.CruiseShip;

public class Main {
    public static void main(String[] args) {
        CarrierShip carrierShip = new CarrierShip(15, 100);
        CruiseShip cruiseShip1 = new CruiseShip(50);
        CruiseShip.increaseOccupiedBeds(100);
        CruiseShip cruiseShip2 = new CruiseShip(30);
        CruiseShip.increaseOccupiedBeds(150);
        FisherShip fisherShip = new FisherShip(10, 30, 5);

        System.out.println("--------------------");

        carrierShip.rescueMessage("Testing Carrier Ship");
        System.out.println();

        System.out.println("Cruise Ships have a total of: " + CruiseShip.getOccupiedBeds() + " occupied beds");
        System.out.println();

        fisherShip.alarm();
        fisherShip.rescueMessage("Testing Fisher Ship");
    }
}