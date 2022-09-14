package com.myapp.doubts;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Hello";
		// olleH

		int startIndex = 0;
		int endIndex = str.length() - 1;

		for (int i = endIndex; i >= startIndex; i--) {
			System.out.print(str.charAt(i));
		}

	}
}
