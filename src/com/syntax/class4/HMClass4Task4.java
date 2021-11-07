package com.syntax.class4;

import java.util.Scanner;

public class HMClass4Task4 {

	public static void main(String[] args) {
		/* Create a Java program that will ask user to input city and temperature in Fahrenheit
		 * Your program should convert F to C and print: 
		 * "The temperature in the city is ___"
		 */   
		 
		 Scanner input=new Scanner(System.in);
		 System.out.println("Please enter the name of the city you live in");
		 String cityName=input.nextLine();
		 System.out.println("Please enter the temperature in the city in Fahrenheit");
		 int temp=input.nextInt();
		 int tempC=(temp - 32)* 5/9;
		 System.out.println(temp+"F will be "+tempC+" degrees in Celcius");
		 
		 

	}

}
