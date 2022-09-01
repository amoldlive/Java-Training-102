package com.myapp.oop;

class Person {

	public String name;
	public int age;
	private String address;
	private String adharNumber;
	protected boolean isAlive;
	
	public void create(String name,int age,String address , String adharNumber , boolean isAlive) {
		this.name=name;
		this.age=age;
		this.adharNumber=adharNumber;
		this.address=address;
		this.isAlive=isAlive;
		
		System.out.println("Person Created ......");
		System.out.println("Info : name : "+name+" | age  : "+age+"  | address : "+address+"  | adharNumber : "+adharNumber+"  | isAlive : "+isAlive);
	}
	
}
class Employee extends Person{
	
}
public class InheritanceExample1 {
	public static void main(String[] args) {
		Person person=new Person();
		person.create("Rahul Sharma", 40, "Nagpur", "ABC4-DEFG-HIJK-LMNO", true);
		
		Employee employee=new Employee();
		employee.create("Mohit Pandey", 50, "Pune", "ABC4-DEFG-HIJK-1234", true);
	
	}
}
