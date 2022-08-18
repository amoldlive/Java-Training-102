package com.myapp.basic;

/*count the number of elements from array  if default value(0) is present ignore it while counting */
public class ArrayExample3 {

	public static void main(String[] args) {
			
		int elementArr[]= {10,0,20,30,0,40,0,50,0,0,60};
	
		int count=0;
		
		for(int i=0;i<elementArr.length;i++) {
				if(elementArr[i]!=0) {
					count++;
				}
		}
		
		System.out.println("Element Count : "+count);
		
		/*find even odd*/
	}
}
