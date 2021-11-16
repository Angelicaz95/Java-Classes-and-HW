package com.syntax.class16;

public class Task3 {
	private static String processString(String str) {
		return str.replaceAll("[^aeyuoiAEYUOI]", "");
		}
	
	
	
	
	
	

	public static void main(String[] args) {
		System.out.println(Task3.processString("java"));
		
	}

}
