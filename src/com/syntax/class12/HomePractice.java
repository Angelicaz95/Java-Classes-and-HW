package com.syntax.class12;

public class HomePractice {
	
	
	public static void printMessage() {
		System.out.println("This is our first method");
	}
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static String caps(String s) {
		return s.toUpperCase();
		
	}
	public static int[] arrayFromInts(int a, int b, int c) {
		int[] array=new int[3];
		array[0]=a;
		array[1]=b;
		array[2]=c;
		return array;
	}

	public static void main(String[] args) {
		
		
		printMessage();
		int sum=add(5,7);
		System.out.println(sum);
		
		String shouting=caps("dont look at my code");
		System.out.println(shouting);
		
		
		int[] array2=arrayFromInts(23, 56, 78);
		System.out.println(array2[0]);
		

	}

}
