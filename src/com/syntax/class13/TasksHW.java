package com.syntax.class13;

public class TasksHW {
	

	void printGreater(int a, int b) {
		if (a > b) {
			System.out.println(a + " is greater");
		} else {
			System.out.println(b + " is greater");
		}
	}

	void printEvenOrOdd(int a) {
		if (a % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}

	}

	void printHello(String country) {
		switch(country) {
			case "USA":
			System.out.println("Hello");
		break;
			case "Ukraine":
				System.out.println("Pryvit");
				break;
				
				
		}
		
	}
	
	boolean isPrime(int a) {
		boolean isPrime=true;
		
		if (a > 1) {
			for (int i = 2; i < a; i++) {
				if (a % 2 == 0) {
					isPrime = false;
					break;
					}
			}
		} else {
			isPrime = false;
		}
		if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
		return isPrime;
		
	}
	
	char getGrade(int score) {
		char grade;
		if(score>90) {
			grade='A';
		}else if(score>80) {
			grade='B';
		}else if(score>70) {
			grade='C';
		}else if(score>50) {
			grade='D';
		}else {
			grade='F';
		}
		return grade;
		
	}
	
	
	

		
	
	
	
	
	
	String createEmail(String firstName, String lastName, String emailType) {
		 return firstName+lastName+"@"+emailType+".com";
		 
		
		
	}

	public static void main(String[] args) {
		TasksHW object = new TasksHW();
		object.printGreater(13, 20);

		object.printEvenOrOdd(12);
		object.printHello("Ukraine");
		
		System.out.println(object.createEmail("angie", "z", "gmail"));
		object.isPrime(2);
		System.out.println(object.getGrade(90));

	
	}

}
