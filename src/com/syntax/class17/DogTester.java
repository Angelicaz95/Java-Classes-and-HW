package com.syntax.class17;

public class DogTester {

	public static void main(String[] args) {
		
		Dog dog=new Dog("Boby", "Black", "Bulldog", 10, 12.5);// creating and Object
		// will call the constructor when code is executed
		
		
		//dog.name="Boby" is not allowed as it's private
		dog.printName();
		
		// object is an instance


	}

}
