package vehicles;

public class MainCar {
    public static void main(String[] args) {
        System.out.println("Hello, Tel-Ran");
//        Car firstCar = new Car(1, "BMW E34", "black", 0);
//        Car secondCar = new Car(2, "Tesla S", "red", 0);
        Cabrio cabriolet = new Cabrio(3,"VW Sirrocco", "yellow", 0, true);
        Jeep jeep = new Jeep();
        /*
        firstCar.id = 1;
        secondCar.id = 2;

        firstCar.color = "black";

        firstCar.model = "BMW E34";
        secondCar.model = "Tesla S";

        System.out.println(firstCar.id);
        System.out.println(secondCar.id);
        System.out.println(firstCar.model);
        System.out.println(secondCar.model);
        System.out.println(firstCar.color);
        System.out.println(secondCar.color);
        */

//        firstCar.drift();
//        secondCar.drift();
//
//        firstCar.getCarInfo();
//        secondCar.getCarInfo();

        cabriolet.drift();
        cabriolet.isOpened = false;

        jeep.drift();

    }

}


