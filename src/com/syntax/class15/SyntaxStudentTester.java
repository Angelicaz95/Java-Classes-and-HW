package com.syntax.class15;

public class SyntaxStudentTester {

	public static void main(String[] args) {
		SyntaxStudent Sorbon=new SyntaxStudent();
		Sorbon.name="Sorbon";
		Sorbon.id="123";
		Sorbon.calculateFee();
		// System.out.println(Sorbon.school); not recommended 
		System.out.println(SyntaxStudent.school); // recommended approach 
		
		

	}

}
