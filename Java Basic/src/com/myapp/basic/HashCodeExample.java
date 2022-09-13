package com.myapp.basic;

import java.util.Objects;

public class HashCodeExample {

	int i = 10;
	String name = "Test";

	public static void main(String[] args) {
		HashCodeExample codeExample = new HashCodeExample();

		System.out.println(codeExample.hashCode());
	}

	@Override
	public int hashCode() {
		return Objects.hash(i, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeExample other = (HashCodeExample) obj;
		return i == other.i && Objects.equals(name, other.name);
	}
	
	

}
