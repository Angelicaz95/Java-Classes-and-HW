package com.syntax.class15;

public class Student {
	String studentName;
	int studentID;
   static int numberOfStudents=0;
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.studentName="Harry";
		s1.studentID=007;
		Student.numberOfStudents++;
		
		
		Student s2=new Student();
		s2.studentName="Hermione";
		s2.studentID=002;
		Student.numberOfStudents++;
		
		
		Student s3=new Student();
		s3.studentName="Ron";
		s3.studentID=005;
		Student.numberOfStudents++;
		System.out.println("Total number of students is: "+Student.numberOfStudents+".");
		
		

	}

}
