package com.myapp.basic;

public class LoopExample1 {
	public static void main(String[] args) {

		int i = 1;
		int lastStep = 10;

		while (i <= lastStep) {
			System.out.println(i);
			i++;
		}

		System.out.println("***********");
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= lastStep);
	}
}
