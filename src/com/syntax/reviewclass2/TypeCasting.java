package com.syntax.reviewclass2;

public class TypeCasting {

	public static void main(String[] args) {
		// bigger number in smaller data type 
		
		byte num=(byte)129;
		
		System.out.println(num); // results will be unexpected because byte can't hold 129. smth to do with binary numbers
		// google big decimals in java
		short number2=125;
		byte num2=(byte)number2;
		System.out.println(num2);
		
		
		System.out.println((int)12.5);
		System.out.println((double)12);
		

	}

}
