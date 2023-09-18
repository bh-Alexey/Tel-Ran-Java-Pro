package homework;

import java.util.ArrayList;
import java.util.Objects;

public class RetirementFund {
    private String fundName;
    private boolean stateGovernment;
    private String registerDate;

    private ArrayList<Worker> depositors = new ArrayList<>();

    public RetirementFund(String fundName, boolean stateGovernment, String registerDate) {
        this.fundName = fundName;
        this.stateGovernment = stateGovernment;
        this.registerDate = registerDate;
    }

    public void setDepositors(ArrayList<Worker> depositors) {
        this.depositors = depositors;
    }

    public ArrayList<Worker> getDepositors() {
        return depositors;
    }


    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public boolean isStateGovernment() {
        return stateGovernment;
    }

    public void setStateGovernment(boolean stateGovernment) {
        this.stateGovernment = stateGovernment;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void getInfo() {
        System.out.println(fundName);
        System.out.println("Registration date is " + registerDate);
        if (stateGovernment == true) {
            System.out.println("Participants: more than " + depositors.size() / 1000 + " thousand");
            System.out.println();
        } else {
            System.out.println("Participants: " + depositors.size());
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RetirementFund that = (RetirementFund) o;

        if (stateGovernment != that.stateGovernment) return false;
        if (!Objects.equals(fundName, that.fundName)) return false;
        return Objects.equals(registerDate, that.registerDate);
    }

    @Override
    public int hashCode() {
        int result = fundName != null ? fundName.hashCode() : 0;
        result = 31 * result + (stateGovernment ? 1 : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RetirementFund{" +
                "fundName='" + fundName + '\'' +
                ", stateGovernment=" + stateGovernment +
                ", registerDate='" + registerDate + '\'' +
                '}';
    }

    public double calculatePensionFor(AbleToCalculatePension obj) {
        if (obj == null) {
            return 0.0;
        }
        if (stateGovernment) {
            return obj.calculatePension();
        } else {
            return 0;
        }
    }

    public double calculateMedianPension() {
        if (getDepositors() == null) {
            return 0.0;
        }
        double pensionPaid = 0;
        for (Worker element: depositors) {
            pensionPaid += element.calculatePension();
        }
        return pensionPaid / depositors.size();
    }
}
