package com.myapp.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private int id;
	private int salary;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}

}

class SortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getId() == o2.getId()) {
			return 0;

		} else if (o1.getId() > o2.getId()) {
			return 1;

		} else {
			return -1;
		}

	}

}

class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

//assignment
class SortBySalary {

}

public class ComparatorExample {
	public static void main(String[] args) {

		Employee employee1 = new Employee(101, 50000, "Tony");
		Employee employee2 = new Employee(104, 60000, "Sonu");
		Employee employee3 = new Employee(102, 80000, "Monu");
		Employee employee4 = new Employee(103, 20000, "Rohit");
		Employee employee5 = new Employee(105, 10000, "Deepak");

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);

		System.out.println("List : - " + employeeList);

		// 3 -> filter by id , filter by salary , filter by name
		SortById sortById = new SortById();
		Collections.sort(employeeList, sortById);

		System.out.println("Sort By ID : - " + employeeList);

		SortByName sortByName = new SortByName();

		Collections.sort(employeeList, sortByName);

		System.out.println("Sort By Name : - " + employeeList);

	}
}
