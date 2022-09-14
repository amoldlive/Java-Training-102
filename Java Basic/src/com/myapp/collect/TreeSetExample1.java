package com.myapp.collect;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {

		// no duplication |values sorted - NSA - ascending order by default | no
		// insertion order
		Set<Integer> treeSet1 = new TreeSet<>();
		treeSet1.add(100);
		treeSet1.add(1);
		treeSet1.add(20);
		treeSet1.add(3);
		treeSet1.add(8);
		treeSet1.add(6);
		treeSet1.add(1);

		System.out.println(treeSet1);
	}
}
