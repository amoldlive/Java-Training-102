package com.myapp.basic;

public class LoopExample4 {
	public static void main(String[] args) {
		pattern3();
	}

	public static void pattern1() {
		/*
		 * 
		 * 
		 */
		for (int i = 0; i < 4; i++) {
			System.out.print("* ");
		}

	}

	public static void pattern2() {

		for (int j = 0; j < 3; j++) { // rows
			for (int i = 0; i < 4; i++) { // column
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern3() {

		for (int i = 1; i <= 3; i++) {
			for (int j = 2; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}

	}

}
