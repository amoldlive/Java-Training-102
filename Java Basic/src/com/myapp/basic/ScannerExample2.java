package com.myapp.basic;
import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		/* User Form*/
		System.out.println("Enter Your first name");
		String fname=scanner.next();
		
		System.out.println("Enter Your last name");
		String lname=scanner.next();
		

		System.out.println("Enter Your age");
		int age =scanner.nextInt();

		System.out.println("Enter Your city");
		String city=scanner.next();
		
		//char ch=city.charAt(0);
		
		
		
		System.out.println("firstName : "+fname);
		System.out.println("last name : "+lname);
		System.out.println("age : "+age);
		System.out.println("City : "+city);
		
		
	}
}
