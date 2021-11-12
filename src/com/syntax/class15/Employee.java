package com.syntax.class15;

public class Employee {
	int empID;
	int salary;
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.empID=123;
		e1.salary=85000;
		System.out.println("Employee's ID: "+e1.empID);
		System.out.println("Employee's salary is: "+e1.salary);
		System.out.println("CEO is "+Employee.CEO);
		
		
		
		Employee e2=new Employee();
		e2.empID=124;
		e2.salary=90000;
		System.out.println("Employee's ID: "+e2.empID);
		System.out.println("Employee's salary is: "+e2.salary);
		System.out.println("CEO is "+Employee.CEO);
		
		
		
		
	}
	
	

	
	}

