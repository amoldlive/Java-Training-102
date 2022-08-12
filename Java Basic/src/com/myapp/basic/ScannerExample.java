package com.myapp.basic;

import java.util.Scanner;
/*
import java.util.Scanner;
import java.util.*;
 */

public class ScannerExample {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		/* User Form*/
		System.out.println("Enter Your age");
		int age=scanner.nextInt();
		
		System.out.println("Enter Your Weight");
		double weight=scanner.nextDouble();
		
		System.out.println("is alive ? -> ");
		boolean isAlive=scanner.nextBoolean();
		
		
		System.out.println("Your Age : "+age);
		System.out.println("Your Weight : "+weight);
		System.out.println("alive status : "+isAlive);
		
	}
}
