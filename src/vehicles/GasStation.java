package vehicles;

import vehicles.Refuelable;

import java.util.ArrayList;

public class GasStation {

    private ArrayList<Cabrio> cabriolets;
    public void refuel(Refuelable patrol) {
        System.out.println("Checked to the Gas station " + patrol.toString());
        patrol.refuel();
    }

    public void printInfoAboutQueue () {
        if (cabriolets == null) {
            System.out.println("Line isn't exist");
            return;
        }
        System.out.println("The car's line: " + cabriolets.size());
        System.out.println("Here those cars " + cabriolets);
    }
    public ArrayList<Cabrio> getCabriolets() {
        return cabriolets;
    }

    public void setCabriolets(ArrayList<Cabrio> cabriolets) {
        this.cabriolets = cabriolets;
    }
}
