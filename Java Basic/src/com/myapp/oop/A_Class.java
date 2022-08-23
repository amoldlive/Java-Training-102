package com.myapp.oop;

// blueprint of the object
// Naming convention - First Letter should be caps and it should be character
class First {
	// variable : instance | local | static
	// instance variable
	int i = 10;
	String name = "softronix";
	boolean isPersent = true;

	// method : instance | static

	// instance method
	// public -> access modifier
	// void -> return type /data type
	// show -> method name
	public void show() {
		// some logic
		System.out.println("show->"+i);
		System.out.println("show->"+name);
		System.out.println("show->"+isPersent);
	}

	// parameters
	public void add(int a, int b) {
		// some logic
		int result=a+b;
		System.out.println("Result of Addition: "+result);
	}

	// with return
	public int sub(int a, int b) {
		// some logic
		int result=a-b;
		System.out.println("substraction result "+result);
		
		return result;
	}

	// with return
	public String getName(String name) {
		// some logic
		return name;
	}

}

class Second {

}

class Third {

}

public class A_Class {

	// constructor

	// some variables

	// some methods

	// block

	public static void main(String[] args) {
		First firstObject = new First(); // object --instance of a class
		System.out.println(firstObject.i);
		System.out.println(firstObject.name);
		System.out.println(firstObject.isPersent);
		firstObject.show();
		firstObject.add(10, 20);
		
		int result=firstObject.sub(20, 10);
		System.out.println("in mian - substractionr result : "+result);
	}
}
