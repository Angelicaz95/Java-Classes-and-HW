package com.syntax.class9;

public class HomeWork3 {

	public static void main(String[] args) {
		// array in reverse order
		
		double[] array= {10.99, 12.99, 14.99, 16.99, 20.99};
		for(int i=4; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
			System.out.println(); // this variant is better 
			for(int a=array.length-1; a>=0; a--) {
				System.out.print(array[a]+" ");
			}
		}

	}


