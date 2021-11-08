package com.syntax.class13;

public class HW1 {
	

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS)
		// 1. Using for loop
		
		String day="Sunday";
		String reverse="";
		for(int i=day.length()-1; i>=0; i--) {
			reverse+=day.charAt(i);
			
		}
		System.out.println(reverse);
		
		
		// 2. Using StingBuffer class. Reverse function is available in StringBufer class because it is mutable. 
		// String class is immutable, reverse function is not available there. 
		
		StringBuffer s=new StringBuffer(day);
		System.out.println(s.reverse());
		

	}

}
