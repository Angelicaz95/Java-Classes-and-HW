package com.syntax.class3;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub    // explicit type casting . narrowing . manual
		double number=10; // defining the variable 
		int number2; // defining 
		number2=(int)number; // assigning 
		
		
		int number3=10;  // widening implicit automatic type casting 
		double number4=number3;
		
		short number7=12;
		byte number8=(byte)number7;
		
		int number9=1000;
		float f=number9;
		
		long l=(long)f;
		
		
		double number10=10.5;
		int number11=(int)number10; // cant do this, will lose data
		System.out.println(number11); // results can be unexpectedfloat
		
		
		

	}

}
