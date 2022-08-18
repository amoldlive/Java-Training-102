package com.myapp.basic;

/*Search Element using linear search*/
public class ArrayExample6 {

	public static void main(String[] args) {
		
		//array 1
		int elementArr[]= {11,31,41,102,51,61,71,81,91,101};
		int searchElement=51;
		boolean isFound=false;
		
		for(int i=0;i<elementArr.length;i++) {
			if(elementArr[i]==searchElement) {
				System.out.println("Element Found at location "+i);
				isFound=true;
				break;
				
			}
		}
		
		if(!isFound) {
			System.out.println("Element not found");
		}
		/*Assignment : binary search*/
	}
}
