package com.myapp.collect;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();
		map.put(4, "Four");
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(1, "One");

		System.out.println(map);
	}
}
