package vehicles;

public class Cabrio extends Car implements Refuelable {
    public boolean isOpened;

    public Cabrio(int id, String model, String color, int currentSpeed, boolean isOpened) {
        super(id, model, color, currentSpeed);
        this.isOpened = isOpened;
    }

    @Override
    public void drift() {
        System.out.println("What a cabriolet's drift...");
    }

    @Override
    public void refuel() {
        System.out.println("Cabriolet fueled with high octane gasoline");
    }
}
