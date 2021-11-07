package com.syntax.class12;

public class StringMethods {

	public static void main(String[] args) {
		String name="John Snow";
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println("First character: "+name.charAt(0));
		System.out.println("Length: "+name.length());
		System.out.println("Last character: "+name.charAt(8));
		System.out.println("Substring: "+name.substring(4, 9));
		
		

	}

} 
