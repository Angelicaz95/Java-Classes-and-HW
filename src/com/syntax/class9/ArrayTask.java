package com.syntax.class9;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array=new char[6];
		array[0]='A';
		array[1]='B';
		array[2]='C';
		array[3]='D';
		array[4]='E';
		array[5]='F';
		System.out.println(array[1]);
		
		char[] gender; // declare and array
		gender=new char[2]; // initialize an array 
		
		
		// more commonly way of creating an array 
		char[] gradesArray= {'A', 'B', 'C', 'D'};
		System.out.println(gradesArray.length);
		System.out.println("Element with index 2 is "+gradesArray[3]);
		
		
		String[] names= {"Oleksandr","Angelica", "Damjan"};
		names[0]="Priya"; // will replace Oleksandr
		
		// arrays are fixed in size!!! you can't increase the size of an array after it is created 
		
		String[] cars= {};
		System.out.println(cars.length);
		
		
		String[] cars1=new String[3]; 
		// you cannot remove values from array, it can only be replaced with a different value 
		

	}

}
