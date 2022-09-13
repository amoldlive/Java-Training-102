package com.myapp.arr;

public class ArrayExample3 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 10; // add/replace data into array
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
