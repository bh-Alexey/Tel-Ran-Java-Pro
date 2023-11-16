package homework;

import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension {
    private double minSalary;
    private double maxSalary;

    private final static double COEFICIENT_OF_PENSION = 0.25;

    private final static int PROFFESSIONS_COEFFICIENT = 3;

    private final static double ADDITIONAL_COEFFICIENT = 0.05;

    private Set<Professions> professions;


    public Worker(String name, int age, double weight, double heigth, int money, double minSalary, double maxSalary) {
        super(name, age, weight, heigth, money);
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public Worker(String name, double minSalary) {
        super(name);
        this.minSalary = minSalary;
    }

    public Set<Professions> getProfessions() {
        return professions;
    }

    public void setProfessions(Set<Professions> professions) {
        this.professions = professions;
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
        System.out.println("This retiree will die after " + years + " years" );
    }
    
    @Override
    public double calculatePension() {
        Gender gender = getGender();

        if (gender == null) {
            return 0.0;
        }

        double averageSalary;
        if (getGender() == Gender.MALE) {
            averageSalary =  CalculatorUtils.calculateAverage((int) minSalary, (int) maxSalary);
        }
        else {
            averageSalary = CalculatorUtils.calculateAverage((int) (minSalary / 2), (int) (maxSalary * 2));
        }

        double professionsReward = 0.0;

        if (professions != null) {
            int countProffessions = professions.size();
            professionsReward = countProffessions / PROFFESSIONS_COEFFICIENT * ADDITIONAL_COEFFICIENT;
        }

        return averageSalary * COEFICIENT_OF_PENSION * (1 + professionsReward);
    }
}
