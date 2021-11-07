package com.syntax.class12;

public class HW4 {
	
	char getGrade(int score) {
		char grade;
		if(score>=90) {
			grade='A';
		}else if(score>=80 && score<90) {
			grade='B';
		}else if(score>=70 && score<80) {
			grade='C';
		}else if(score>=50 && score<70) {
			grade='D';
		}else {
			grade='F';
		} 
		return grade;
		
	}

	public static void main(String[] args) {
		HW4 object=new HW4();
		
	
		System.out.println(object.getGrade(85));

	}

}
