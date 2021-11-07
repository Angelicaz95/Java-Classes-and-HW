package com.syntax.class10;

public class Project10 {

	public static void main(String[] args) {
		int[] numbers= {15, 10, 17, 13, 30};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int number:numbers) {
			if(number>largest) {
				secondLargest=largest;
				largest=number;
				
			}else if(number>secondLargest && largest!=number) {
				secondLargest=number;
			}
			
		}
		
		
		System.out.println(secondLargest);

	}

}
