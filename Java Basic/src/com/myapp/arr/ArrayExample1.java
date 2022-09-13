package com.myapp.arr;

public class ArrayExample1 {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };

		System.out.println("Size of the array : " + arr.length); // 4

		System.out.println("oth location " + arr[0]); // 10

		System.out.println("1th location " + arr[1]); // 20

		System.out.println("2th location " + arr[2]); // 30

		System.out.println("3th location " + arr[3]); // 40

		// System.out.println("3th location " + arr[4]); //throws exception
		// ArrayIndexOutOfBounds

		arr[0] = 90; // 10 --> 90

		System.out.println("oth location " + arr[0]); // 90
		System.out.println("Size of the array : " + arr.length); // 4

		// arr[4] = 10; // throws exception - ArrayIndexOutOfBounds
	}
}
