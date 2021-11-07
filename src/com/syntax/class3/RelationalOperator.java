package com.syntax.class3;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1=10;
		int number2=20;
		boolean results=number1==number2; 
		
		
		System.out.println(number1==number2); // checks if both variables contain the same thing
		
		
		System.out.println(number1>number2);
		System.out.println(number1<number2); // will get false if both numbers are equal
		
		System.out.println(number1>=number2);
		System.out.println(number1<=number1);
// if something is not not equal to, we use!=
		System.out.println(number1!=number2);
		
	}

}
