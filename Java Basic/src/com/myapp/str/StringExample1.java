package com.myapp.str;

public class StringExample1 {
	public static void main(String[] args) {

		// scp
		String val = "MyString";
		String val2 = "MyString";
		String val3 = "MyString";

		String val4 = "mystring";

		// heap
		String obj1 = new String("MyString");
		String obj2 = new String("MyString");
		String obj3 = new String("MyString");

		String obj4 = new String("mystring");

		System.out.println(val == val2); // T
		System.out.println(val2 == val3); // T
		System.out.println(val == val3); // T

		System.out.println(val3 == val4); // F

		System.out.println(obj1 == obj2); // F
		System.out.println(obj2 == obj3); // F

		System.out.println(obj1.equals(obj2)); // T
		System.out.println(obj1.equals(obj4)); // F

		System.out.println(obj1.equalsIgnoreCase(obj4)); // T

		System.out.println(val == obj1); // F
		System.out.println(val.equals(obj1)); // T

	}
}
