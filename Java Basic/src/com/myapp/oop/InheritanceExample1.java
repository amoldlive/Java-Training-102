package com.myapp.oop;

class Person {

	public String name;
	public int age;
	private String address;
	private String adharNumber;
	protected boolean isAlive;

	public void create(String name, int age, String address, String adharNumber, boolean isAlive) {
		this.name = name;
		this.age = age;
		this.adharNumber = adharNumber;
		this.address = address;
		this.isAlive = isAlive;

		System.out.println("Person Created ......");
		System.out.println("Info : name : " + name + " | age  : " + age + "  | address : " + address
				+ "  | adharNumber : " + adharNumber + "  | isAlive : " + isAlive);
	}
	
	private void show() {
		System.out.println("I am private method");
	}

	//within + outside the package inherit
	protected void show2() {
		System.out.println("I am protected method");
	}
	
	//within the package inherit
	void show3() {
		System.out.println("I am Defualt Method");
	}
}

class Employee extends Person {
	int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println("Employee Salary : "+salary);
	}
}
class GovEmployee extends Employee{
	
}
public class InheritanceExample1 {
	public static void main(String[] args) {
		Person person = new Person();
		person.create("Rahul Sharma", 40, "Nagpur", "ABC4-DEFG-HIJK-LMNO", true);
		//person.show(); // error - private
		person.show2(); //protected
		person.show3();
		
		Employee employee = new Employee();
		employee.create("Mohit Pandey", 50, "Pune", "ABC4-DEFG-HIJK-1234", true);
		//employee.show(); //private
		employee.show2(); // protected
		employee.show3();
		employee.setSalary(5000);
		employee.printSalary();
		
		GovEmployee govEmployee=new GovEmployee();
		govEmployee.create("Mohit Varma", 26, "Gujrat", "ABC4-DEFG-HIJK-5678", false);
		govEmployee.setSalary(10000);
		govEmployee.printSalary();
	
	}
}
