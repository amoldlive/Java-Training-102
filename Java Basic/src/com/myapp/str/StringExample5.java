package com.myapp.str;

//reverse the string
public class StringExample5 {
	public static void main(String[] args) {

		String str = "My String is Available fro mutation";
		reverse1(str);
		System.out.println("\n***********");
		reverse2(str);
	}

	public static void reverse1(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void reverse2(String str) {
		if (str.length() <= 0) {
			return;
		}
		int length = str.length() - 1;
		System.out.print(str.charAt(length));
		reverse2(str.substring(0, length));
	}
}
