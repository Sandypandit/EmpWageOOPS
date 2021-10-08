package com.bridgelabz;
import java.util.Random;

class EmpWagebuilder {
	String name;
	int empID;

	public void attendance() {
		Random rd = new Random(2);
		int a = rd.nextInt();
		if(a==1) { System.out.println("Employee is present"); }
		else { System.out.println("Employee is absent"); }
	}
	
	public EmpWagebuilder(String name, int empID) {
		this.name = name;
		this.empID = empID;
		System.out.println(name+"\n"+empID);
	}
	public static void main(String[] args){
		//Empwagebuilder
		EmpWagebuilder emp1 = new EmpWagebuilder("Sandesh", 2347);
		emp1.attendance();
		System.out.println(emp1);
	}
}