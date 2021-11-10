package com.syntax.class14;

public class HW2 {

	public static void main(String[] args) {
		// How would you reverse a String word by word?
		String a="Today is a nice day";
		String [] r=a.split(" ");
		
		for(int i=r.length-1; i>=0; i--) {
			System.out.print(r[i]+" ");
			
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		// will reverse the string character by character
		 
		StringBuffer b=new StringBuffer(a);
		System.out.println(b.reverse());
		
		
		
		String reverse="";
		for(int i=a.length()-1; i>=0; i--) {
			reverse+=a.charAt(i);
		}
		
		System.out.println(reverse);
		
		
		
		
		
		
		}
		
		

	}
	


