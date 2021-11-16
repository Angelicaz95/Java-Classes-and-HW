package com.syntax.class16;

public class ClassTasks {
	public static String method (String name) {
		String reverse="";
		for ( int i=name.length()-1; i>=0; i--) {
			reverse+=name.charAt(i);
			
			
		}
		return reverse;
	}

	
	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString(); // method chaining 
		
		
	}
	public static void main(String[] args) {
		
		System.out.println(ClassTasks.method("Alona"));
		System.out.println(ClassTasks.reverse("Alfredo"));
		
	}

}
