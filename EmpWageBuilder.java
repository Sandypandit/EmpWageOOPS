package com.bridgelabz;
import java.util.Random;

public class EmpWageBuilder {
	public static final int WagePerHour = 20;
	public static final int workDays = 20;
	int monthlyWage=0, workHours=0;
	int monthlyWorkHours=0;
	int presentdays = 0;
	String name;
	int empID;
	int p=1;
	
	public int dailyWage() { // daily wage calculator
		Random rd = new Random();
		int attendance = rd.nextInt(2);
		
		if(attendance == 0){ 
			workHours = 8; //present
            		System.out.printf("Day %d: P, ", p++);
            		presentdays++;
		}
		
        	else if(attendance == 1){ 
			workHours = 0;//absent
            		System.out.printf("Day %d: A, ", p++); 
		}
		
		int DailyWage = WagePerHour*workHours;
		
		return DailyWage;
	}
	
	public void monthlyWageCond() {
		//Monthly wage Calculation

		for (int i=1;i<=workDays;i++) { 
			monthlyWage += dailyWage();
			//daily calculations of work hours
			monthlyWorkHours+=workHours;
		}
		
		if (monthlyWorkHours==100 && presentdays==20) {
			System.out.println("\nMonthly wage of employee is Rs " + monthlyWage+"\n");
		}
		else {
			System.out.println("\nIncomplete working Hours or Days\n"
					+ "Whole month working Hours = "+monthlyWorkHours+
					"\nWhole month working days = "+presentdays);
		}
	}
	
	public EmpWageBuilder(String name, int empID) { //Constructor
		this.name = name;
		this.empID = empID;
		System.out.println(this.name+"\n"+this.empID);
	}

	public static void main(String[] args) {
		
		EmpWageBuilder emp1 = new EmpWageBuilder("Sandesh", 2347);
		EmpWageBuilder emp2 = new EmpWageBuilder("Swapnil", 2098);

		emp1.monthlyWageCond();
		
		emp2.monthlyWageCond();
	}

}