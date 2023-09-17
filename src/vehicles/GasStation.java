package vehicles;

import vehicles.Refuelable;

public class GasStation {

    public void refuel(Refuelable patrol) {
        System.out.println("Checked to the Gas station " + patrol.toString());
        patrol.refuel();
    }
}
