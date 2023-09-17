package vehicles;

public class Airplane implements Refuelable{
    private String type;
    private int serialNumber;

    @Override
    public void refuel() {
        System.out.println("Airplane use just only kerosin fuel");
    }

    public void fly() {
        System.out.println("Let's fly");
    }
}
