package com.syntax.class12;

public class Method4Tester {

	public static void main(String[] args) {
		Methods4 anyName= new Methods4();
		anyName.method1(); // wont print anything unless syso("anyName")
		// we have to store the value first 
		String name=anyName.method1();
		System.out.println(name);
		
		System.out.println(anyName.method2("Roman"));
		
		// void methods don't return anything and can't return anything 
		// you can't put a return in void method 
		
		// System.out.println(anyName.method3()); // will get an error
		// because method3 does not return anything 
		
		// String name1=anyName.method3(); will give an error because it doesn't return anything 
		anyName.method3(); // will print Sandy 
		
		// methods that return something will be assigned to variables 
		anyName.method4("Nasir");
		
		anyName.methods5("Henok");
		System.out.println(anyName.methods5("Henok"));// for return methods we always need syso
		// will not print Henok, will print Aysha , because its returning Aysha 
		

	}

}
