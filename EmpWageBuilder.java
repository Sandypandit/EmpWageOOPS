package com.bridgelabz;
import java.util.Random;

class EmpWagebuilder {
	public static int WagePerHour = 20;
	public static int FullTimeHours = 8;
	String name;
	int empID;
	int att; 

	public void attendance() { // attendance checker
		Random rd = new Random();
		int att = rd.nextInt(2);
		System.out.println(att);
		if(att==1) { System.out.println("Employee is present"); this.att=att; }
		else { System.out.println("Employee is absent"); this.att=att;}
	}
	
	public void dailyWage() { // daily wage calculator
		int DailyWage = WagePerHour*FullTimeHours;
		if(this.att==1) { 
			System.out.println("Daily wage of Employee "+ this.name + " is "+DailyWage); }
		else { System.out.println("No daily wage for today"); }
		
	}
	
	public EmpWagebuilder(String name, int empID) { //Constructor
		this.name = name;
		this.empID = empID;
		System.out.println(this.name+"\n"+this.empID);
	}
	
	public static void main(String[] args){
		//Empwagebuilder
		EmpWagebuilder emp1 = new EmpWagebuilder("Sandesh", 2347);
		EmpWagebuilder emp2 = new EmpWagebuilder("Swapnil", 2098);
		
		emp1.attendance();
		emp1.dailyWage();
		
		emp2.attendance();
		emp2.dailyWage();
	}
}