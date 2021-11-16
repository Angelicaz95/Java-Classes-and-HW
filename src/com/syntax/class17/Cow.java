package com.syntax.class17;

public class Cow {
	static int price = 5;
	String name;
	String breed;
	String color;
	int age;
	double weight;

	// this keyword is used to distinguish your instance variables and your local
	// variables

	public Cow() {

	}

	public Cow(String name) {

		this.name = name;

	}

	public Cow(String name, String breed) {

		// name = name;
		this(name);
		this.breed = breed;
	}

	public Cow(String name, String breed, String color) {

		// this.name = name;
		// this.breed = breed;
		this(name, breed);

		this.color = color;
	}

	public Cow(String name, String breed, String color, int age) {

		// this.name = name;
		// this.breed = breed;
		// this.color = color;
		this(name, breed, color); // this must be the first line 
		this.age = age;
	}

	public Cow(String name, String breed, String color, int age, double weight) {

		// this.name = name;
		// this.breed = breed;
		// this.color = color;
		// this.age = age;
		this(name, breed, color, age);
		this.weight = weight;
	}

	void printName() {
		System.out.println(name);

	}
	void printAllInfo() {
		System.out.println(name+" "+breed+" "+color+" "+age+" "+weight);
		
	}
}