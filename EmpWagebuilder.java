package com.bridgelabz;
import java.util.Random;

class EmpWagebuilder {
	public static int WagePerHour = 20;
	int FullTimeHours;
	String name;
	int empID;
	int att;
	String n = null;

	public void attendance() { // attendance checker
		Random rd = new Random();
		int att = rd.nextInt(2);
		//System.out.println(att);
		if(att==1) { System.out.println("\nEmployee is present"); this.att=att; }
		else { System.out.println("\nEmployee is absent"); this.att=att;}
	}
	
	public void dailyWage() { // daily wage calculator
		Random rd = new Random();
		int empType = rd.nextInt(2);
		if(empType == 0){ FullTimeHours = 8; n = "Full"; //Full time
                     System.out.println("Full time Employee"); }
		
        else if(empType == 1){ FullTimeHours = 4; n = "Part"; //Part time
                     System.out.println("Part time Employee"); }
		
		int DailyWage = WagePerHour*FullTimeHours;
		if(this.att==1) { 
			System.out.printf("Daily wage of %s time Employee ", n);
			System.out.println(this.name + " is "+DailyWage+"\n");
		}
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