package com.syntax.class8;

public class HomeWorkTask4 {

	public static void main(String[] args) {
		// clock
	
		for(int i=0; i<24; i++) {
			for(int j=0; j<=59; j++)
				if(i<10 && j<10 ) {
				System.out.println("0"+i +" : "+"0"+j);
				System.out.println("--------");
			} else if(i>=10 && j<10) {
				System.out.println(i+" : "+"0"+j);
				System.out.println("--------");
			}else if(i<10 && j>=10) {
				System.out.println("0"+i+" : "+j);
				System.out.println("--------");
			}else {
				System.out.println(i+" : "+j);
				System.out.println("--------");
			}
		}
 
	}

}
