package com.syntax.class10;

public class ArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers= {
				{100,200,300},
				{9,8,7},
		};
		System.out.println(numbers.length); // will print 2. has 2 arrays in 2D	 array
		System.out.println(numbers[1][1]);
		
		// retrieve all elements using for each nested loop 
		for(int[] num:numbers) {
			for(int n:num) {
				System.out.print(n+" ");
				
			}
			System.out.println();
		}
		
		// using nested for loops
		
		for( int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
			int element=numbers[i][j];
			System.out.println(element);
			}
			
			System.out.println();
		}
		
		
		
		}

	}


