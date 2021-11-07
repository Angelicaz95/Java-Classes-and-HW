package com.syntax.class4;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// shortcut to import existing class to the current class
		// cmnd+shift+o
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=scan.next(); // it will capture String value from console 
		System.out.println("Hello "+name);
		System.out.println("Please enter your age?");
		int age=scan.nextInt();
		System.out.println(name+" you are "+age+" years old");
		
		

	}

}
