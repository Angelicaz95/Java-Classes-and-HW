package com.syntax.class17;

public class Task3 {
	String name;
	int age;
	char gender;
	String occupation;
	boolean isHappy;

	 Task3(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public Task3(String name, int age, char gender) {
		
		this(name, age);
		this.gender = gender;
	}

	protected Task3(String name, int age, char gender, String occupation) {
		
		this(name, age, gender);
		this.occupation = occupation;
	}

	private Task3(String name, int age, char gender, String occupation, boolean isHappy) {
		
		this(name, age, gender, occupation);
		this.isHappy = isHappy;
	}

	public static void main(String[] args) {
		Task3 a=new Task3("Ollie", 17);
		
		
		Task3 b=new Task3("Ollie", 17, 'M', "student", true);
		
		
		
		

	}

}
