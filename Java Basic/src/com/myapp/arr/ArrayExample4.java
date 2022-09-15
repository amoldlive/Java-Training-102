package com.myapp.arr;

public class ArrayExample4 {
	public static void main(String[] args) {

		int[] arr = { 6, 5, 2, 1, 6 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println("Sum : " + sum);
	}
}
