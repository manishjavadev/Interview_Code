package com.manish.javadev.collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		System.out.println(h.add(null));
		h.add(10);
		System.out.println(h.add("Z"));// false
		System.out.println(h);// [null, D, B, C, 10, Z]
	}

}
