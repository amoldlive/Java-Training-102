package com.myapp.casting;

public class TypeCastingExample2 {
	public static void main(String[] args) {

		// Narrowing - need to take care by developers
		// data loss

		long l = 10l;

		int i = (int) l;

		double d = 1111.11111111;
		System.out.println("Double Value : " + d);

		float f = (float) d;
		System.out.println("Float Value : " + f);

		int ascii = 65;

		char ch = (char) ascii;
		System.out.println("Character : " + ch);

	}
}
