package com.myapp.collect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Nagpur");
		list.add("Nagpur");
		list.add("Nagpur");
		list.add("Nagpur");
		list.add("Delhi");
		list.add("Pune");

		System.out.println(list); // allows duplicates

		list.remove("Delhi");

		System.out.println(list);

		list.remove("Nagpur");

		System.out.println(list);

	}
}
