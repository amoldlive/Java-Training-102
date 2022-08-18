package com.myapp.basic;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		/*datatype[] variable={values};*/
		
		// way -1 to create array
		int[] arr2=new int[4]; //size is mandatory
		
		arr2[0]=10;
		arr2[1]=20;
		arr2[2]=30;
		arr2[3]=40;
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+"\t");
		}
		
	
		
	}
}
