//EmpLoyee Wage Builder

public class EmpWageBuilder {
	//constant
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	

	//main method
	public static void main(String args[]){
		computeEmpWage("DMART",20,22,40);		
	}
	

	//Wage Computation method
	public static int computeEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {

		//variables
		int empHours = 0;
		int totalWorkingDay = 0;
		int totalEmpHours = 0;

		while (totalEmpHours <= maxHrsPerMonth && totalWorkingDay < numOfWorkingDays){
			totalWorkingDay++;
			//Generate random value to check employee do work full time, part time or absent
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
		}

		int totalEmpWage = totalEmpHours * empRatePerHr;
		System.out.println("Monthly Employee Wage is " + totalEmpWage);
		return totalEmpWage;
	}
}