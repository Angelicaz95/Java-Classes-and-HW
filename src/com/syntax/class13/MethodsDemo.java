package com.syntax.class13;

import java.util.Arrays;

public class MethodsDemo {
	

	int add(int num1, int num2) {
		return num1+num2;
		
	}
	
	
	int [] doubleArray(int [] arr) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr[i]*2;
		}
		return arr;
	}
	
	void printArray(int [] array) {
		for(int number:array) {
			System.out.print(number+" ");
		}
		
	}
	
	

	public static void main(String[] args) {
		
		
		MethodsDemo object=new MethodsDemo();
		object.add(10, 10);
		System.out.println(object.add(10, 10));
		
		int[] array= {10, 10, 10};
		object.doubleArray(array);
		System.out.println(Arrays.toString(array));
		
		
		int[] arr= {10,20,30};
		object.printArray(arr);
		
		}
		

	}


