package com.syntax.class14;

public class HW1 {
	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		String sentence="It might snow this weekend";
		String a=sentence.replace(" ", "");
		System.out.println(a);
		
		// Create a String that should be combination of letters, numbers and special characters.
		// Find out how many alpha characters are there in the String.
		
		String b="HGFCDuygkjsbdf9274658253!@#$%^&*)(*&^%";
		System.out.println(b.replaceAll("[^A-Za-z0-9]", "").length());
		
		// You have a String a=”Is it Saturday? Is it raining? Do we have a Java Class today?”
		// How would you find out how many sentences are in that String?
		
		String c="Is it Saturday? Is it raining? Do we have a Java Class today?";
		System.out.println(c.split("[?]").length);
		
		// How would you reverse a String character by character?
		
		String day="Wednesday";
		String reverse="";
		for( int i=day.length()-1; i>=0; i--) {
			reverse+=day.charAt(i);
		}
	
		System.out.println(reverse);
		
		
		StringBuffer day1=new StringBuffer(day);
		System.out.println(day1.reverse());
		
	
		
	}

}