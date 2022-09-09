package com.myapp.collect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Nagpur");
		list.add("Delhi");
		list.add("Pune");

		System.out.println(list.contains("Delhi")); // True
		System.out.println(list.contains("Mumbai")); // False

		Object[] objectArr = list.toArray();
		for (int i = 0; i < objectArr.length; i++) {
			System.out.println(objectArr[i]);
		}

		// Object obj=new ArrayListExample5();
	}
}
