package com.syntax.class17;

public class Student1 {
	private String name;
	private String address;
	public Student1(String name, String address) {
		
		this.name = name;
		this.address = address;
	}
	public void displayInfo() {
		System.out.println("The name of the student is: "+name+".");
		System.out.println("Student's address is: "+address+".");
	}
	
	
	
}
