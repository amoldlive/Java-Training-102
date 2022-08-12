package com.myapp.basic;

public class WhileExample2 {
	public static void main(String[] args) {
		/*1-10*/
		/*10-1*/
		
		int end=10;
		int start=1;
		
		while(start<=end) {
			System.out.println(start);
			start++;	
		}
	
		System.out.println("*******************");
		
		start=1;
		while(end>=start) {
			System.out.println(end);
			end--;
		}
	}
}
