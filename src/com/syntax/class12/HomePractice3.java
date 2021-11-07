package com.syntax.class12;

public class HomePractice3 {
	String method() {
		System.out.println("Margarita");
		return"Julia";
	}
	
	void nameMethod(String name) {
		System.out.println(name);
	
	
	}
	
	
	
	

	public static void main(String[] args) {
		HomePractice3 object=new HomePractice3();
		
		
		String name=object.method(); // will print Margarita only
		
		System.out.println(name); // will print both M and J
		
		object.nameMethod("Mirjana");
		
		
		
		}
	
	
}
