package vehicles;

public abstract class Car {
    public int id;
    private final String model;
    private String color;
    private int currentSpeed;
    private int cost;
    private int fuel;
    private TransmissionType type;


    public TransmissionType getType() {
        return type;
    }

    public void setType(TransmissionType type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {

        if (type != null) {
            this.cost = (int) (cost * type.getCoefficientOfCost());
        }
        else {
            this.cost = cost;
        }
    }

    public int getFuel() {
        return fuel;
    }

    public Car(int id, String model, String color, int currentSpeed) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public Car(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public Car() {
        id = 0;
        model = "";
    }
    public abstract void drift(); //{
    // System.out.println("What a drift...!");
    //}

    public void getCarInfo() {
        System.out.println("Info about car");
        System.out.println("Car identification: " + id);
        System.out.println("Car model: " + model);
        System.out.println("Car's color: " + color);
        System.out.println();
    }

    public void runCar(int speed) {
        currentSpeed = speed;
        switch (type) {
            case MECHANIC:
                System.out.println("Nemnogo zaglohli, no poehali");
                break;
            case AUTO:
                System.out.println("Otlichno poehali");
                break;
            case AI:
                System.out.println("Ya dage otpustil rul'");
                break;
        }
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void startEngine() {
        check();
        if(currentSpeed == 0) {
            startAfterCheck();
        }
    }

    private void check() {
        System.out.println("Check fuel");
        System.out.println("Check electronic");
    }

    private void startAfterCheck() {
        System.out.println("start electronic");
        System.out.println("Start starter");
        System.out.println("...Engine started");
    }

    public void changeCost(int sale) {
        cost = cost - cost * sale / 100;
    }

    public void checkCost(double sale) {
        double answer = cost - cost * sale;
        cost = (int) answer;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (currentSpeed != car.currentSpeed) return false;
        if (cost != car.cost) return false;
        if (!model.equals(car.model)) return false;
        return color.equals(car.color);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + currentSpeed;
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", cost=" + cost +
                '}';
    }
}
