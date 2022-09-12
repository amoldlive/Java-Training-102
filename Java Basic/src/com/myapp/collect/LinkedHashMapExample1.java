package com.myapp.collect;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample1 {
	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");

		System.out.println(map);
	}
}
