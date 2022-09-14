package com.myapp.doubts;

public class StringExample2 {
	public static void main(String[] args) {

		String str = "hello";
		String str2 = "HELLO";

		System.out.println(str.equals(str2)); // false // case sensetive
		System.out.println(str.equalsIgnoreCase(str2)); // not case sensetive

	}
}
