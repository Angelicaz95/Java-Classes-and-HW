package com.syntax.class13;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		System.out.println("What is mom's first name?");
		String momName=input.next();
		System.out.println("What is dad's first name?");
		String dadName=input.next();
		System.out.println("What is child's gender?");
		String gender=input.next();
		String name=null; 
		
		
		if(gender.equalsIgnoreCase("boy")) {
			name=(dadName.substring(0, 3)).concat(momName.substring(momName.length()-2, momName.length()));
			System.out.println(name.toUpperCase());
		

	}else if(gender.equalsIgnoreCase("girl")) {
		name=(momName.substring(0,2).concat(dadName.substring(dadName.length()-3, dadName.length())));
		System.out.println(name.toUpperCase());
	}

}
}