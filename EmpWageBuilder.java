package com.bridgelabz;
import java.util.Random;

public class EmpWageBuilder {
	public static int WagePerHour = 20;
	int workDays = 20, monthlyWage=0, FullTimeHours;
	String name;
	int empID;
	int p=1;
	
	public int dailyWage() { // daily wage calculator
		Random rd = new Random();
		int empType = rd.nextInt(2);
		
		if(empType == 0){ FullTimeHours = 8; //Full time
                     System.out.printf("Day %d: P, ", p++); }
		
        else if(empType == 1){ FullTimeHours = 0;//absent
                     System.out.printf("Day %d: A, ", p++); }
		
		int DailyWage = WagePerHour*FullTimeHours;

		return DailyWage;
	}
	
	public void monthlyWage() {
		//Monthly wage Calculation

		for (int i=1;i<=workDays;i++) { monthlyWage += dailyWage(); }
		//p=1;
		System.out.println("\nMonthly wage of employee is Rs " + monthlyWage+"\n");
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
