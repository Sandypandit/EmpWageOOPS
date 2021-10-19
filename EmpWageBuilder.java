//EmpLoyee Wage Builder

public class EmpWageBuilder {
    //main method
    public static void main(String args[]){
        ComputeWageForEachCompany dmart = new ComputeWageForEachCompany("dMART", 20, 22, 40);
	ComputeWageForEachCompany relaince = new ComputeWageForEachCompany("Relaince", 30, 18, 50);
        dmart.computeWage();
        System.out.println(dmart);
        relaince.computeWage();
        System.out.println(relaince);
    }
}

class ComputeWageForEachCompany{
    
    //constant
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHrsPerMonth;
    private int totalEmpWage;

    //Wage Computation method
    ComputeWageForEachCompany(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void computeWage(){
        int empHours = 0;
        int totalWorkingDay = 0;
        int totalEmpHours = 0;

        while (totalEmpHours <= maxHrsPerMonth && totalWorkingDay < numOfWorkingDays){
                totalWorkingDay++;
                //to check whether employee worked full time, part time or is absent
                int empcheck = (int)Math.floor(Math.random()*10) % 3;

                //Condition statement switch case
                switch(empcheck){
                        case IS_FULL_TIME:
                                empHours = 8;
                                break;
                        case IS_PART_TIME:
                                empHours = 4;
                                break;
                        default:
                                empHours = 0;
                }

                //calculate hours
                totalEmpHours += empHours;
                System.out.println("Working day : " + totalWorkingDay + " and Employee Hours : " + empHours);
        }

        totalEmpWage = totalEmpHours * empRatePerHr;
    }

}