package com.syntax.class9;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=10;
		int[] array=new int[4];
		array[0]=12;
		array[1]=10;
		array[2]=13;
		array[3]=14;
		System.out.println(array[3]+array[0]);
		
		double[]a=new double[3]; // storing 3 elements inside the array 
		a[0]=11.99;
		a[1]=1.78;
		a[2]=67.67;

		
		// can i replace a value from an array?
		
		a[0]=100.99;
		
		String[] colors=new String[4];
		colors[0]="Red";
		colors[1]="Blue";
		colors[2]="Yellow";
		colors[3]="Green";
		// colors[4]="Pink"; - ArrayIndexOutOfBoundsException:
		System.out.println("The size of the array is "+colors.length);
		

	}

}
