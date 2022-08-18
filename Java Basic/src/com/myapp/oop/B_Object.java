package com.myapp.oop;

//instance of the class
public class B_Object {

	
	
	
		
	//instance variable
	//instance methods
	
	
	//type of variable 
	//instance
	//local
	//static
	
	
	//ways to initialize object 
		//through reference variable
		//through method
		//through constructor
	
	//access modifier
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.show();
		s.rollNumber=10;
		s.name="Amol";
		s.show();
	}
}
class Student{
	//instance variable
	int rollNumber;
	String name;
	
	//instance method
	public void show() {
		
		//local variables
		int age=10;
		String address="Nagpur";
		
		System.out.println("Roll Number : "+rollNumber);
		System.out.println("Name : "+name);
		
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
		
	}
}