package com.myapp.basic;

public class OperatorsLogical {
	public static void main(String[] args) {
		/*
			&& AND  
			||  OR
			!   NOT
		*/
		
		boolean value=false;
		//value=true;
		
		if(!value) {
			System.out.println("it is true");
		}else {
			System.out.println("it is false");
		}
		
		/*num>0 AND num<100*/
		int num=1;
		
		if(num>0 && num<100 && num!=5) {
			System.out.println("valid number");
		}else {
			System.out.println("invalid number");
		}
		
		/*a OR e OR o OR i OR u*/
		char ch='i';
		
		if(ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u' ) {
			System.out.println("it is vowel");
		}else {
			System.out.println("It is not a vowel");
		}
		
		/*A E I O U using OR*/
	}
}
