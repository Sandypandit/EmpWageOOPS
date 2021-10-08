package com.bridgelabz;
import java.util.Random;

public class EmpWageBuilder {
	public static int WagePerHour = 20;
	int workDays = 20;
	String name;
	int empID;
	int p=1;
	
	public void monthlyWage() {
		//Monthly wage Calculation
		Random random = new Random();
		int workHoursComp = random.nextInt(98,101); //getting working HOURS
	    int workDaysComp = random.nextInt(18,21); //getting working DAYS

		double dailyWage = 160;
		double monthlyWage = dailyWage*workDays;
		if (workHoursComp ==100 && workDaysComp == 20){
		System.out.println("\n"+this.name+", you have completed montly working hours and days");
		System.out.println("Monthly wage of employee is Rs " + monthlyWage);
	    }
		else{ System.out.println("\n"+this.name+", You haven't completed working "
				+ "hours of 100 hours or working days of 20 days"); };
	}
	
	public EmpWageBuilder(String name, int empID) { //Constructor
		this.name = name;
		this.empID = empID;
		System.out.println(this.name+"\n"+this.empID);
	}

	public static void main(String[] args) {
		
		EmpWageBuilder emp1 = new EmpWageBuilder("Sandesh", 2347);
		EmpWageBuilder emp2 = new EmpWageBuilder("Swapnil", 2098);

		emp1.monthlyWage();
		
		emp2.monthlyWage();
	}

}
