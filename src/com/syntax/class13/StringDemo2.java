package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String name=" "; // counts the space, will print false
		// System.out.println(name.isBlank()); isBlank is undefined in java 8
		
		
		System.out.println(name.isEmpty());
		name="Anastasia";
		System.out.println(name.isEmpty());
		
		
		String str=" Baaaaaatch 11 is . . .     !"; // do not remove spaces in between, only before or after
		System.out.println(str.trim());
		String str1="Bohdan";
		System.out.println(str1.startsWith("B"));
		
		System.out.println(str1.endsWith("A"));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}