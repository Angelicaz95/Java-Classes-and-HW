package com.syntax.class11;

public class Car {
	String make;
	String model;
	String color;
	int year;
	double milage;
	void moveForward() { // defining the behavior 
		System.out.println("Car is now moving forward"); 
		// behavior cannot be inside main method 
		 // calling a method - only then code will be executed 
		
	}
	void applyBreaks()  { // defining the method 
		System.out.println("Applying breaks");
	}

	public static void main(String[] args) {
		Car dreamCar=new Car();
		dreamCar.make="Tesla";
		dreamCar.model="S";
		dreamCar.color="White";
		System.out.println("My dream car is "+dreamCar.make);
		dreamCar.moveForward(); // calling the moveForward behavior 
		dreamCar.applyBreaks(); // calling a method - only then code will be executed 
        // by behavior we mean things that object can do
		
	}

}
