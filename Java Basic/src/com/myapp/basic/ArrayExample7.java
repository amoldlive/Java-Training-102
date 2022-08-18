package com.myapp.basic;

import java.util.Arrays;

/*Arrays Class*/
public class ArrayExample7 {

	public static void main(String[] args) {
		
		//array 1
		int elementArr[]= {101,45,11,21,31,81,91,51}; //unsorted Array
		int searchElement=31;
			
	
		
		Arrays.sort(elementArr);
		
		
		int location=Arrays.binarySearch(elementArr, searchElement);
		
		System.out.println("Element : "+searchElement +" |  Location of element : "+location);
	
		int[] arr1= {10,20,30};
		int[] arr2= {10,20,30};
		int res=Arrays.compare(arr1, arr2);
		System.out.println("Compare Result : "+res);
	}
	
	
	
}
