package com.myapp.oop;

import java.time.LocalDateTime;

class Student {
	//data member private
	private String name;
	private int id;
	private String address;
	private String dob;
	
	//setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("New Name : "+name+"  | time : "+LocalDateTime.now());
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id*10;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	//All Arg Constructor
	
	
	public void display() {
		System.out.println("Student Info : - ");
		System.out.println("Name : "+getName() +"  | id : "+getId()+"  |  address : "+getAddress()+"  |  DOB : "+getDob() );
		System.out.println("****************************************************************************");
	}

	public Student(String name, int id, String address, String dob) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.dob = dob;
	}

	
}

public class EncapsulationExample {
	public static void main(String[] args) {
		Student student=new Student("Rahul Sharma",101,"Nagpur","03/08/1945"); //create
		
		student.setName("Rohan Mishra"); //update
		
		//System.out.println(student.getName());
		
		student.display();
		//student.name
		
		/*
		Student student2=new Student();
		student2.setName("Aniket Rao");
		student2.setId(103);
		student2.setAddress("Mumbai");
		student2.setDob("08/08/1980");
		student2.display();
		
		*/
	}
}
