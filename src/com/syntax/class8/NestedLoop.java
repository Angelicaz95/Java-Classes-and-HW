package com.syntax.class8;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i=1; i<=3; i++) { // outer loop 
			
		System.out.println("outer loop");
			for(int j=1; j<=4; j++) { // inner loop 
				System.out.println("inner loop");
			}
		}

	}

}
