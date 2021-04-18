package com.manish.javadev.exception;

import java.util.Iterator;
import java.util.TreeSet;

public class Test1 implements Comparable {
	public String name;

	public int compareTo(Object o) {
		return 0;
	}

	public static void main(String args[]) {
		String a = "abcd";
		String b = "12345";
		String c = "12345";
		TreeSet ts = new TreeSet();
		ts.add(a);
		ts.add(b);
		ts.add(c);
		Iterator itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
