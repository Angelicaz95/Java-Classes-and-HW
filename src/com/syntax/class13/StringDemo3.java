package com.syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String name="This class is easy";
		System.out.println(name.contains("class"));
		System.out.println(name.contains("a"));
		System.out.println(name.contains("A")); // case sensitive 
		
		
		
		String str1="Hello";
		String str2="heeeeeello";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str2.toUpperCase().charAt(0));// will return spaces too 
		
		System.out.println("=======");
		System.out.println(str2.indexOf('e'));
		System.out.println(str2.indexOf('l', str2.indexOf('l')+1)); 
		
		
		System.out.println(name.substring(5)); // always counts the spaces inside " "
		
		System.out.println(name.substring(5, 11)); // ignores first 5 letters(including space) + ignore everything after index 11
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
