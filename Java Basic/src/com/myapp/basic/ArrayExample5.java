package com.myapp.basic;

/*Copy  Array Elements into another array*/
public class ArrayExample5 {

	public static void main(String[] args) {
		
		//array 1
		int elementArr[]= {10,0,20,30,0,40,0,50,0,0,60};
		int[] newArr=new int[elementArr.length];
		
		for(int i=0;i<elementArr.length;i++) {
				newArr[i]=elementArr[i];
		}
		
		for(int j=0;j<newArr.length;j++) {
			System.out.print(newArr[j]+"\t");
		}
		
		/*Assigment - number is armstrong or not*/
	}
	
}
