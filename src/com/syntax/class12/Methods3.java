package com.syntax.class12;

public class Methods3 {

	int getMax(int num1, int num2) {
		
		
		 if (num1 > num2) {
			return num1;
		} else {
		 	return num2;
		 }

	}
	public static void main(String[] args) {
		Methods3 object=new Methods3();
		
		int largerNumber=object.getMax(90,5);
		System.out.println(largerNumber);
		
	}

}
