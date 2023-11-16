package homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RetirementFund {
    private String fundName;
    private boolean stateGovernment;
    private final String registerDate;
    private List<Worker> depositors;
    private Map<DayOfWeek, Boolean> workDays;

    public RetirementFund(String fundName, boolean stateGovernment, String registerDate) {
        this.fundName = fundName;
        this.stateGovernment = stateGovernment;
        this.registerDate = registerDate;
    }

    public Map<DayOfWeek, Boolean> getWorkDays() {
        return workDays;
    }

    public void setWorkDays(Map<DayOfWeek, Boolean> workDays) {
        this.workDays = workDays;
    }

    public void setDepositors(List<Worker> depositors) {
        this.depositors = depositors;
    }

    public List<Worker> getDepositors() {
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
        if (stateGovernment) {
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
        if (stateGovernment && isWorkDayToday()) {
            return obj.calculatePension();
        } else {
            return 0;
        }
    }

    private boolean isWorkDayToday() {
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeekNow = localDate.getDayOfWeek();

        if (workDays == null) {
            return false;
        }

        return workDays.get(dayOfWeekNow);
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
