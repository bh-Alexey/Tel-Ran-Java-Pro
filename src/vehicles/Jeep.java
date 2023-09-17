package vehicles;

public class Jeep extends Car implements Refuelable{

    public final static int MAX_SPEED = 60;
    public final static int RECOMMENDED_SPEED = 30;

    @Override
    public void drift() {
        System.out.println("Jeep can't do drift");
    }

    public void doSomething() {
        System.out.println("Test message");
    }

    @Override
    public void refuel() {
        setFuel(100);
        System.out.println("Jeep fueled with diesel");

    }

    public static int getRecommendedSpeed() {
        return MAX_SPEED / 2;
    }
}

