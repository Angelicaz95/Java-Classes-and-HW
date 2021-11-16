package com.syntax.class16;

public class AccessModifiersDemo1 {

	private String name;
	// private - will only be accessible only in this class
	int age;
	public double salary;
	// public can be accessed inside the class, inside same package and outside the package
	// default - accessible within the package
	// protected - 

	void displayName() {
		System.out.println(name);
	}

	void displayAge() {
		System.out.println(age);
	}

	void displaySalary() {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		AccessModifiersDemo1 am=new AccessModifiersDemo1();
		am.name="Nabil";
		am.age=22;
		am.salary=120000;
		
		

	}
}
