package execute;

import homework.RetirementFund;

public class MainFund {
    public static void main(String[] args) {
        RetirementFund firstFund = new RetirementFund("New York State Common Retirement Fund", true, "03/04/1972");
        RetirementFund secondFund = new RetirementFund("YMCA Retirement Fund", false, "08/12/2001");

        firstFund.getInfo();
        secondFund.getInfo();
    }
}
