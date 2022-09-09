package com.myapp.collect;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample1 {
	public static void main(String[] args) {
		// insertion order || no duplication
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Nagpur");
		linkedHashSet.add("Nagpur");
		linkedHashSet.add("Nagpur");
		linkedHashSet.add("Delhi");
		linkedHashSet.add("Mumbai");

		System.out.println(linkedHashSet);
	}
}
