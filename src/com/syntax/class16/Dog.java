package com.syntax.class16;

public class Dog {
	String name;
	static int numOfLegs=4;
	String color;
	
	void displayColor() {
		System.out.println(color);
	}
	
	void displayName() {
		System.out.println(name);
	}
	static void displayLegs() {
		System.out.println(numOfLegs);
		// displayName(); not allowed
		// System.out.println(name);
	}
	
	void printInfo() {
		displayName();
		displayColor();
		
	}
	
	
	

	

}
