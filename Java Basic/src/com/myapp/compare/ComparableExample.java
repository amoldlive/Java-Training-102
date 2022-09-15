package com.myapp.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {

	private int rollNumber;
	private String name;
	private int age;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int rollNumber, String name, int age) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student student) {
		if (this.rollNumber == student.rollNumber) {
			return 0;
		} else if (this.rollNumber < student.rollNumber) {
			return 1; // +ve number
		} else {
			return -1; // -ve number
		}
	}

}

public class ComparableExample {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Ashish Pande", 20);
		Student student2 = new Student(2, "Manisha Sharma", 25);
		Student student3 = new Student(3, "Rohit Varma", 28);
		Student student4 = new Student(4, "Rahul Dhavan", 21);
		Student student5 = new Student(5, "Kailash Mohan", 30);

		List<Student> studentList = new ArrayList<>();
		studentList.add(student5);
		studentList.add(student1);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student2);

		System.out.println(studentList);

		Collections.sort(studentList);

		System.out.println("Filter By RollNumber -> " + studentList);

	}
}
