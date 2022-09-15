package com.myapp.arr;

public class ArrayExample5 {
	public static void main(String[] args) {

		// linear search 
		int[] arr = { 6, 5, 2, 1, 6 };
		int element = 9; // 3

		boolean isFound = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				System.out.println("Element Found at location " + i);
				isFound = true;
				break;
			}
		}

		if (!isFound) {
			System.out.println("Element Not Present in Array");
		}

	}
}
