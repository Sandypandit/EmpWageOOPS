//EmpLoyee Wage Builder

public class EmpWageBuilder {
	//constant
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int HourlyEmpRate = 20;
	public static final int MaxWorkingDays = 20;
	public static final int MaxMonthlyHours = 100;
	

	//main method
	public static void main(String args[]){
		computeEmpWage();		
	}
	

	//Wage Computation method
	public static int computeEmpWage() {

		//variables
		int empHours = 0;
		int totalWorkingDay = 0;
		int totalEmpHours = 0;

		while (totalEmpHours <= MaxMonthlyHours && totalWorkingDay <= MaxWorkingDays){
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

			//calculating total monthly hours
			totalEmpHours += empHours;
		}

		int totalEmpWage = totalEmpHours * HourlyEmpRate;
		System.out.println("Monthly Employee Wage is " + totalEmpWage);
		return totalEmpWage;
	}
}