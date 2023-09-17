package homework;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private double weight;
    private double heigth;
    private int money;
    private PersonGender gender;

    private Person dad;

    private final static double COEFICIENT_OF_PENSION = 0.25;

    public Person(String name, int age, double weight, double heigth, int money) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.heigth = heigth;
        this.money = money;
    }


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getDad() {
        return dad;
    }
    public void setDad(Person dad) {
        this.dad = dad;
    }
    public PersonGender getGender() {
        return gender;
    }

    public int getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWieght() {
        return weight;
    }

    public void setWieght(double wieght) {
        this.weight = wieght;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void setGender(PersonGender gender) {
        this.gender = gender;
    }


    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + heigth + "ft");
        System.out.println("Weight: " + weight + "lb");
        System.out.println("Wallet: " + money + "$");
    }

    public void goToWork() {
        if (age >= 18 || age < 70) {
            System.out.println("Go to work");

        }
        else {
            System.out.println("Stay at home");
        }
    }

    public void die() {
        System.out.println("Person passed away");
    }

    public abstract void die(int years);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (Double.compare(person.weight, weight) != 0) return false;
        if (Double.compare(person.heigth, heigth) != 0) return false;
        if (money != person.money) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heigth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + money;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", heigth=" + heigth +
                ", money=" + money +
                '}';
    }
}
