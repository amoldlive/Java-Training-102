package com.myapp.doubts;

public class StringExample {
	public static void main(String[] args) {

		String str = "Hello";
		String str2 = "Hello";
		String str3 = "heLLo";

		String str4 = new String("Hello");
		String str5 = new String("Hello");

		System.out.println("Length : " + str.length());

		System.out.println("Char At 1 : " + str.charAt(1));

		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println();

		String test = "Hello Welcome To Softronix";

		// seperator -> space

		String[] strArr = test.split(" "); // Split

		String firtsName = "Rahul";
		String lastName = "Mishra";

		System.out.println(firtsName.concat(lastName));
		System.out.println(firtsName + lastName);

		String word = "   A    ";
		System.out.println(word.length()); //6
		String newWord = word.trim();
		System.out.println(newWord + "    :  " + newWord.length()); //1

	}
}
