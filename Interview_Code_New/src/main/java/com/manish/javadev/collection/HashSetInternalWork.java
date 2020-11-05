package com.manish.javadev.collection;

import java.util.HashSet;

public class HashSetInternalWork {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		System.out.println(set.add("manish"));
		set.add("Divya");
		System.out.println(set.add("manish"));
		System.out.println("Done");
	}
}
