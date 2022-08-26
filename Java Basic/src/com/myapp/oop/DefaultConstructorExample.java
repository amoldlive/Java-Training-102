package com.myapp.oop;

public class DefaultConstructorExample {
	int i;
	// variable
	// method
	// constructor

	// default
	// parameterize

	// default constructor
	// use : to initialize variables
	// call : when we create object
	public DefaultConstructorExample() {
		i = 10;
		System.out.println("Creating Object ...." + i);
	}

	public DefaultConstructorExample(String objectName) {

		System.out.println("Prameterize Object ...."+objectName );
	}
	
	public DefaultConstructorExample(int id) {

		System.out.println("Prameterize Object ...."+id );
	}

	public static void main(String[] args) {
		DefaultConstructorExample object = new DefaultConstructorExample();
		
		DefaultConstructorExample object2 = new DefaultConstructorExample("MyObject");
		
		DefaultConstructorExample object3 = new DefaultConstructorExample(12345);
	}
}
