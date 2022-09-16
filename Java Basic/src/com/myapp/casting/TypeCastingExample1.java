package com.myapp.casting;

public class TypeCastingExample1 {
	public static void main(String[] args) {

		// Widening - Automatically performed by java

		byte b = 10; // small

		short s = b; // big

		int i = s;

		System.out.println("Value of i : " + i);

		float f = b;

		System.out.println("Value of float : " + f);

		float f2 = 30.33f;

		double d = f2;
		System.out.println("Value of Double Value : " + d);

	}
}
