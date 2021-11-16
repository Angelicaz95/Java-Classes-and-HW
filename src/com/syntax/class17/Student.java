package com.syntax.class17;

public class Student {
	// purpose of constructor - to initialize/build the object
	// constructor can't be static - because you can't access instance field - it can't initialize them - whole purpose of the constructor is gone then
	String name;
	double grade1;
	double grade2;
	double grade3;
	
	// constructor - to initialize the field 
	// method - to write a logic

	public Student(String name, double grade1, double grade2, double grade3) {

		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	public void printAverage() {
		System.out.println((grade1+grade2+grade3)/3);

	
	}
	
	public static void main(String[] args) {
		Student s=new Student("Oliver", 96, 97,89);
		s.printAverage();
	}
}
