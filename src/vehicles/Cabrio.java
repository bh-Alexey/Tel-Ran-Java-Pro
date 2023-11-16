package vehicles;

public class Cabrio extends Car implements Refuelable, Comparable<Cabrio> {
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

    @Override
    public int compareTo(Cabrio o) {
        String model = getModel();
        String anotherModel = o.getModel();

        if (model == null) {
            return -1;
        }

        if (anotherModel == null) {
            return 1;
        }

        if (model.length() > anotherModel.length()) {
            return 1;
        }

        if (model.length() < anotherModel.length()) {
            return -1;
        }

        return model.compareTo(anotherModel);
    }

}
