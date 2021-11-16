package com.syntax.class17;

public class Dog {
	private String name; // declaring fields
	private String color;
	private String breed;
	int age;
	double weight;
	
	public Dog(String dogName, String dogColor, String dogBreed, int dogAge, double dogWeight) { // constructor 
		System.out.println("Dog's constructor is called");
		name=dogName; // initializing 
		color=dogColor;
		breed=dogBreed;
		age=dogAge;
		weight=dogWeight;
		
		
	}
	
	public void printName() {
		System.out.println(name);
	}

	public void printBreed() {
		System.out.println(breed);
	}

}
