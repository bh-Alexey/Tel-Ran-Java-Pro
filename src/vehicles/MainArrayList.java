package vehicles;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        List<Cabrio> cabriolets = new ArrayList<>();

        Cabrio firstCabriolet = new Cabrio(1,"BMW", "black", 0, false);
        Cabrio secondCabriolet = new Cabrio(2, "Volvo", "yellow", 0, true);

        cabriolets.add(firstCabriolet);
        cabriolets.add(secondCabriolet);

        gasStation.setCabriolets(cabriolets);

        gasStation.printInfoAboutQueue();

        gasStation.refuelAll();
    }
}
