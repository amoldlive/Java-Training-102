package com.myapp.collect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample4 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Nagpur");
		list.add("Delhi");
		list.add("Pune");

		System.out.println(list);

		List<String> duplicateList = new ArrayList<>();
		duplicateList.addAll(list); //

		System.out.println(duplicateList);

		System.out.println(list.equals(duplicateList)); // true

		List<String> duplicateList2 = new ArrayList<>();
		duplicateList2.addAll(list); //
		duplicateList2.remove("Delhi");
		System.out.println(duplicateList2);

		System.out.println(list.equals(duplicateList2)); // false	System.out.println(list.equals(duplicateList)); // true

	}
}
