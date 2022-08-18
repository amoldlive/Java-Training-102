package com.myapp.oop;

public class MethodExample {
	
	public static void main(String[] args) {
		
		MethodExample methodExample=new MethodExample();
		methodExample.printData(10);
		
		methodExample.getData(12);
		
		//double the number 
		int ivalue=methodExample.getData(12);
		System.out.println("iValue of return method : "+ivalue);
		//some logic
		//int doubleVal=ivalue*2;
		//print result
		
	//	System.out.println("Double Value : "+doubleVal);
	}
	
	//defined in MethodExample class
	public void printData(int i) {
		System.out.println("Value of I : "+i);
	}

	//defined in MethodExample class
	public int getData(int i) {
		//System.out.println("Value of I : "+i);
		//block of statements
		return i;
	}
}
