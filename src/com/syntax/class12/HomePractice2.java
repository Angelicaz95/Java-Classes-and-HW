package com.syntax.class12;

public class HomePractice2 {

	public static void main(String[] args) {
		
		System.out.println(cube(2));
		
		cube(2); // wont print anything
		
		int number=cube(3);
		System.out.println(number);
		sayHello("Angie", 26);
		
		String name=method("Oliver"); // wont print Oliver
		// because the return value is Julia
		System.out.println(name);
		method("Eugene"); // wont print Eugene 

	}
	public static String method(String name) {
		return "Julia";
		
	}

	public static int cube(int a) {
		return (a * a * a);
		// you can't put a syso statement after return keyword
	}
	
	
	public static void sayHello(String name, int age) {
		System.out.println("Hello "+name+". You are "+age+" years old");
	}

}
