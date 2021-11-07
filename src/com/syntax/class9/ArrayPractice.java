package com.syntax.class9;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words= {"Java","Saturday","Day", "coding", "is"};
		System.out.println(words[1]+" "+ words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		System.out.println("--------------------");
		for(int i=0; i<words.length;i++) {
			System.out.println(words[i]);
		}

	}

}
