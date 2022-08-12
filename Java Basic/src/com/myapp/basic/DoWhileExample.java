package com.myapp.basic;

public class DoWhileExample {
	public static void main(String[] args) {
		
		/*1-10*/
		int start=1;
		int end=10;
				
		do {
			System.out.println(start);
			start++;
		}while(start<=end);
		
		System.out.println("********************");
		
		start=11;
		do {
			System.out.println(start);
			start++;
		}while(start<=end);
		
	}
}
