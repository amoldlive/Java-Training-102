package com.myapp.basic;

/*Find Sum oF Array Elements */
public class ArrayExample4 {

	public static void main(String[] args) {
			
		int elementArr[]= {10,0,20,30,0,40,0,50,0,0,60};
			
		int sum=0;
		for(int i=0;i<elementArr.length;i++) {
			sum=sum+elementArr[i];
		}
		
		System.out.println(sum);
	}
}
