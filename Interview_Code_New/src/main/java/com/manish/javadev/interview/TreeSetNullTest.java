package com.manish.javadev.interview;

import java.util.TreeSet;

public class TreeSetNullTest {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(null);// NullPointerException
	}
}
