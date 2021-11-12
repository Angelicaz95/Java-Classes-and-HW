package com.syntax.class15;

public class Dog {
	// instance variable - inside the class but outside of the block of code, can still be accessed in side the block of code
	String name; // instance variable
	String color;// instance variable
	
	static int number=2;
	
	
	
	void sleep() {  
		int time=3; // local variable ---> can only be accessed inside the block of code
		System.out.println(name+" is sleeping");
		System.out.println(time);
	}
	void eat() {
		System.out.println(name+ " is eating");
	}
	
	
	

		

	}


