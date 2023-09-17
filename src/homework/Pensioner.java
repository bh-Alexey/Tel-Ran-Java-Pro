package homework;

public class Pensioner extends Person {
    private double pension;

    private int years;


    public Pensioner(String name, int age, double weight, double heigth, int money, double pension) {
        super(name, age, weight, heigth, money);
        this.pension = pension;
        this.years = years;
    }

    public int getYears() {
        return years;
    }


    public void setYears(int years) {
        this.years = years;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pensioner pensioner = (Pensioner) o;

        return Double.compare(pensioner.pension, pension) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(pension);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pension=" + pension +
                '}';
    }
    @Override
    public void die() {
       System.out.println("The pensioner died. Earned: " + ((getAge() - 50) * pension));
    }

    @Override
    public void die(int years) {
        System.out.println("This person will not live before pension and will die after" + years + " years");
    }
}
