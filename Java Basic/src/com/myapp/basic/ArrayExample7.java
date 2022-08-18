package com.myapp.basic;

import java.util.Arrays;
import java.util.Iterator;

/*Arrays Class*/
public class ArrayExample7 {

	public static void main(String[] args) {

		// array 1
		int elementArr[] = { 101, 45, 11, 21, 31, 81, 91, 51 }; // unsorted Array

		for (int i = 0; i < elementArr.length; i++) {
			System.out.print(elementArr[i] + "\t");
		}

		Arrays.sort(elementArr);
		System.out.println();

		for (int i = 0; i < elementArr.length; i++) {
			System.out.print(elementArr[i] + "\t");
		}

		System.out.println("\n*******************************");
		int search = 21;
		int location = Arrays.binarySearch(elementArr, search);
		if (location < 0) {
			System.out.println("Element not found");
		} else {

			System.out.println("Element : " + search + " |  Location of element : " + location);
		}

		System.out.println("\n***********************************");

		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 10, 20, 30 };
		int res = Arrays.compare(arr1, arr2);
		//res == 0 : matched
		//res <0 : unmatched
		System.out.println("Compare Result : " + res);

	}

}
