package com.myapp.str;

public class StringExample4 {
	public static void main(String[] args) {

		String str = "My String is Available fro mutation";
		System.out.println(str.substring(3));
		System.out.println(str.substring(10));

		String str2 = "Nandanvan , Nagpur , Pin - 440020";
		System.out.println(str2.substring(27));
		System.out.println(str2.substring(str2.length() - 6));

		System.out.println(str2.substring(2, 11)); // End index location - 1
	}
}
