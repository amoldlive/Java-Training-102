package com.myapp.collect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample6 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Nagpur");
		list.add("Delhi");
		list.add("Pune");

		System.out.println(list);

		list.clear();

		System.out.println(list);
	}
}
