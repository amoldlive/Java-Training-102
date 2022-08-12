package com.myapp.basic;

public class ForLoopExample3 {
	public static void main(String[] args) {
		
		/*
		  *****
		  *****
		  *****
		 
		 * */
		
		int column =5;
		int rows=3;
		
		for(int j=1;j<=rows;j++) {
			for(int i=1;i<=column;i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
