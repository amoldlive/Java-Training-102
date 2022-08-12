package com.myapp.basic;

public class SwitchExample {
	public static void main(String[] args) {

		/* 1-5 */
		int value = 1;

		switch (value) {
		case 1: {
			System.out.println("ONE");
		}

			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		default:
			System.out.println("Invalid Number");
			break;
		}

		// find vowels
		char ch = 'a';
		switch (ch) {
		case 'a':
			System.out.println("It is a vowel");
			break;
		case 'e':
			System.out.println("It is a vowel");
			break;
		default:
		}

		// Nested Switch
		/* collage - years - semister[1,2] - subject */
		int year = 1;
		int semester = 2;

		switch (year) {
		case 1:
			switch (semester) {
			case 1:	
					System.out.println("Year 1 Sem 1 -> Math , Chemestry , ED , Physics ");
				break;
			case 2:
				System.out.println("Year 1 Sem 2 -> C , HTML , Java , DS ");
				break;
			default:
				System.out.println("Invalid Semester");
				break;
			}
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			System.out.println("invalid year");
			break;
		}

		//case 2 /case3 assignment
	}

}
