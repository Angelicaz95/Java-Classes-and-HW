package com.syntax.class15;

public class Recap {

	public static void main(String[] args) {
		String str3 = "";
		// String is not recommended because every time it will search the memory and that will slow down the code
		for (int i = 0; i < 5; i++) {
			str3 = str3 + i;
		}
		System.out.println(str3);

		StringBuilder a = new StringBuilder();
		
		
		// when you have to change the value of the String variable, always use StringBuilder class

		for (int j = 0; j < 5; j++) {
			a.append(j);
		}
		System.out.println(a);
		String str4="Mykl wrote a poem";
		StringBuilder strBuilder=new StringBuilder(str4);
		strBuilder.reverse();
		System.out.println(strBuilder);
		
		
		
		
		
		
	}
	

}
