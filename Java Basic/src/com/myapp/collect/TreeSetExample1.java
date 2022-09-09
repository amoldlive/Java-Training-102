package com.myapp.collect;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {

		// no duplication |values sorted - NSA - ascending order by default | no insertion order
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(100);
		treeSet.add(1);
		treeSet.add(20);
		treeSet.add(3);
		treeSet.add(8);
		treeSet.add(6);
		treeSet.add(1);

		System.out.println(treeSet);
	}
}
