package homework;

public class Worker extends Person implements AbleToCalculatePension {
    private double minSalary;
    private double maxSalary;

    private String profession;

    private final static double COEFICIENT_OF_PENSION = 0.25;

    public Worker(String name, int age, double weight, double heigth, int money, double minSalary, double maxSalary) {
        super(name, age, weight, heigth, money);
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public Worker(String name, String profession, double minSalary) {
        super(name);
        this.profession = profession;
        this.minSalary = minSalary;
    }

    public Worker(String name, String profession) {
        super(name);
        this.profession = profession;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Worker worker = (Worker) o;

        if (Double.compare(worker.minSalary, minSalary) != 0) return false;
        return Double.compare(worker.maxSalary, maxSalary) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(minSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }

    @Override
    public void die() {
        System.out.println("Person died before retirement");
    }

    @Override
    public void die(int years) {
        System.out.println("This retiree will die after " + years + " лет" );
    }
    
    @Override
    public double calculatePension() {
        if (getGender() == null) {
            return 0.0;
        }
        if (getGender() == PersonGender.MALE) {
            return CalculatorUtils.calculateAverage((int) minSalary, (int) maxSalary) * COEFICIENT_OF_PENSION;
        }
        else {
            return CalculatorUtils.calculateAverage((int) (minSalary / 2), (int) (maxSalary * 2)) * COEFICIENT_OF_PENSION;
        }
    }
}
