package com.myapp.collect;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {

		// Java 1.2 -> Legacy Data Structure of java | Synchronised DS
		Vector<Integer> list = new Vector<>();
		list.addElement(10);
		list.addElement(20);
		list.addElement(30);
		list.addElement(40);

		// legacy iterator
		Enumeration<Integer> enumerator = list.elements();
		while (enumerator.hasMoreElements()) {
			System.out.println(enumerator.nextElement());
		}
	}
}
