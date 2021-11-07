package com.syntax.reviewclass2;

public class ArithmeticOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=10;
		int number2=20;
		System.out.println(number/number2); // data type is int. int cant hold decimal numbers. thats why the answer is o
		System.out.println(number%number2); // when % is of smaller number, the answer is always the smaller number 
		double number3=10;
		double number4=20;
		System.out.println(number3/number4);
		System.out.println(number3%number4);
		
		
		System.out.println(number4/number3);
		System.out.println(number4%number3);
		
		number3=-10;
		number4=-20;
		
		System.out.println(number4/number3); // both are negative, so result will be positive 
		System.out.println(number4%number3); // no cancelation properrty in modulus ( like in adition or division)
		
		number3=10.5;
		number4=5.5;
		System.out.println(number3%number4); 

	}

}
