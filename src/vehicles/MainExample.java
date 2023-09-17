package vehicles;

public class MainExample {
    public static void main(String[] args) {

        Jeep jeep = new Jeep();
        Cabrio cabriolet = new Cabrio(1, "AUDI", "Red", 0, true);
        GasStation gasStation = new GasStation();

        gasStation.refuel(jeep);
        jeep.setType(TransmissionType.MECHANIC);
        cabriolet.setType(TransmissionType.AUTO);
    }

    public static void test(Car car) {
        car.drift();
    }

}
