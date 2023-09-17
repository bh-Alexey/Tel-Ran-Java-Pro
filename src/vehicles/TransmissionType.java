package vehicles;

public enum TransmissionType {
    AUTO(1.3),
    MECHANIC(1),
    AI(2);

    private final double coefficientOfCost;

    TransmissionType(double coefficientOfCost) {
        this.coefficientOfCost = coefficientOfCost;
    }

    public double getCoefficientOfCost() {
        return coefficientOfCost;
    }

    public boolean isNorAI() {
        return !this.equals(AI);
    }
}
