package com.bridgelabz;
import java.util.Random;

public class EmpWagebuilder {
	public static int WagePerHour = 20;
	int FullTimeHours;
	String name;
	int empID;
	
	public void dailyWage() { // daily wage calculator
		Random rd = new Random();
		int empType = rd.nextInt(3);
		int DailyWage;
		switch (empType) 
	      {
	          //comparing value of variable against each case
	        case 0:
	          System.out.println("\nFulltime Employee");
	          FullTimeHours=8;
	          DailyWage = WagePerHour*FullTimeHours;
			  System.out.println("Daily wage of Fulltime employee "+ this.name +" is " + DailyWage +"Rs");
	          break;
	        case 1:
	          System.out.println("\nPart time Employee");
	          FullTimeHours=4;
	          DailyWage = WagePerHour*FullTimeHours;
			  System.out.println("Daily wage of part time employee"+ this.name +" is " + DailyWage +"Rs");
	          break;
	        case 2:
	          System.out.println("\n"+this.name+" is absent");
	          break;

	    }
		
		
	}
	
	public EmpWagebuilder(String name, int empID) { //Constructor
		this.name = name;
		this.empID = empID;
		System.out.println(this.name+"\n"+this.empID);
	}

	public static void main(String[] args) {
		EmpWagebuilder emp1 = new EmpWagebuilder("Sandesh", 2347);
		EmpWagebuilder emp2 = new EmpWagebuilder("Swapnil", 2098);
		
		emp1.dailyWage();
		
		emp2.dailyWage();
	}

}