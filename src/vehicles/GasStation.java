package vehicles;

import vehicles.Refuelable;

import java.util.ArrayList;
import java.util.List;

public class GasStation {

    private List<Cabrio> cabriolets;
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

    public void refuelAll() {
        if ((cabriolets == null) || (cabriolets.size() == 0)) {
            return;
        }
        for (Cabrio cabriolet : cabriolets) {
            cabriolet.refuel();
        }
        cabriolets = new ArrayList<>(); //cabriolets.clear();
    }

    public List<Cabrio> getCabriolets() {
        return cabriolets;
    }

    public void setCabriolets(List<Cabrio> cabriolets) {
        this.cabriolets = cabriolets;
    }
}
