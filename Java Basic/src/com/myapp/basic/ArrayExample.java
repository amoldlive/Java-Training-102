package com.myapp.basic;

public class ArrayExample {
	public static void main(String[] args) {
		
		/*datatype[] variable={values};*/
		
		// way -1 to create array
		int[] arr={10,20,30,40,50,60,70};
		
		String[] cityArr={"Nagpur","Mumbai","Pune"};
		
		float[] weightArr= {2.5F,99.2F,33.4F};
		
		
		//way 2 to create array
		int[] arr2=new int[4]; //size is mandatory

		
		int firstValue=arr[0];
		int secondValue=arr[1];
		
		System.out.println(firstValue);
		System.out.println(secondValue);
		
		System.out.println("************************");
	
		//for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
