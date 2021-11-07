package com.syntax.class9;

public class AllFromArray {

	public static void main(String[] args) {
		int[] num= {100, 200, 300, 400, 500};
		System.out.println(num[0]);
		
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("------------");
// to access all elements from array you can use for each loop/advanced loop/enhanced loop
		for(int n:num) {
			System.out.println(n);
		}
		
		String[] colors= {"red", "blue", "white"}; 
		for(String col:colors) {
			System.out.println(col);
		}
		
	}

}
