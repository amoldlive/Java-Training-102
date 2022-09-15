package com.myapp.arr;

import java.util.Arrays;

public class ArrayExample6 {
	public static void main(String[] args) {

		// sort
		int[] arr = { 6, 5, 2, 1, 6 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println();
		Arrays.sort(arr); // sort

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

	}
}
