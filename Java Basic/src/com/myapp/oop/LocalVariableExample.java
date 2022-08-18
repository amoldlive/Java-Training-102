package com.myapp.oop;

public class LocalVariableExample {
	
	int x; //declartion
	
	int a=10; //declaration
	
	int c=a; //assignment
	
	public static void main(String[] args) {
		//instance variables not accessible to main method directly
		//can access instance variables in normal methods directly
		
		// to access instance variables in main method we need to take help of instance(object)
		
		//System.out.println("Value of a "+a);
		
		LocalVariableExample val=new LocalVariableExample();
		//System.out.println("Value of a "+val.a);
		
		//method call
		val.printValue();
		
	}
	
	public void printValue() {
		 //x=50; //assigning value
		
		//int a=30; //local variable he
		 //a=30;  // assigning value to instance variable
			
		int c=40;  //local variable
		//int c=a; // assigning value to declared variable
		
		
		System.out.println("getValue a : "+a);
		System.out.println("getValue c : "+c);
	}
	
}
