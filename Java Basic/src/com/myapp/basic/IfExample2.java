package com.myapp.basic;

public class IfExample2 {
	public static void main(String[] args) {
		/*number +ve , number <100 , number -ve , number >-100 */
		
		int num=90;
		if(num>0) {
			System.out.println("Number is +ve");
			if(num<100) {
				System.out.println("Number is less than 100");
			}else {
				System.out.println("Number is greater than 100");
			}
		}else {
			System.out.println("Number is -ve");
			if(num>-100) {
				System.out.println("Number is greater than -100");
			}else {
				System.out.println("Number is less than -100");
			}
		}

	}
}
