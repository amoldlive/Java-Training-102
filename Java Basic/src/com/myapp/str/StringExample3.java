package com.myapp.str;

public class StringExample3 {
	public static void main(String[] args) {

		/* cook -> how many times cook appeared in below String */
		String str = "cook my top cook my book cook my head cook my brain";

		int count = 0;
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			// System.out.println(strArr[i]);
			if (strArr[i].equals("cook")) {
				count++;
			}
		}

		System.out.println("Cook : " + count);
	}
}
