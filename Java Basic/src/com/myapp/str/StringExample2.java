package com.myapp.str;

public class StringExample2 {
	public static void main(String[] args) {

		String str = "MyString is no more a string";
		System.out.println(str.toUpperCase()); // upper case
		System.out.println(str.toLowerCase()); // lower case
		System.out.println(str.charAt(2)); // char at // S

		char[] chArr = str.toCharArray(); // return character array
		for (int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i] + "\t");
		}

		String str2 = str.concat(" Hello");
		System.out.println(str2);

		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
		}

		System.out.println("\n********************");

		String str3 = "   I   ";
		System.out.println(str3.length()); // 7
		String str4 = str3.trim();
		System.out.println(str4.length());
		
		
	}

}
