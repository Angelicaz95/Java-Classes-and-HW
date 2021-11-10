package com.syntax.class14;

public class HW3 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not?
		
		String word="racecar";
		String reverse="";
		for(int i=word.length()-1; i>=0; i--) {
			reverse+=word.charAt(i);
		}
		
		
		
		if(word.equalsIgnoreCase(reverse)) {
			System.out.println(word+" is palindrome");
		}else {
			System.out.println(word+" is not a palindrome");
		}

		
		// How would you swap  2 strings without a temporary variable?
		
		String a="Wednesday";
		String b="Friday";
		a=a+b;// a=WednesdayFriday
		b=a.substring(0,a.length()-b.length());
		System.out.println(b); //b=Wednesday
		a=a.substring(b.length());
		System.out.println(a);
		
		
		
		
		
	}	
}