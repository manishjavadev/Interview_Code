package com.manish.javadev.interview;

import java.util.Arrays;

public class TDDTestDemo {
	Object[] inetrnal = {};

	public static void main(String[] args) {
		TDDTestDemo tdd = new TDDTestDemo();
		tdd.addData();
	}

	private void addData() {
		inetrnal = new Object[] { "Manish" };
		System.out.println(inetrnal.length);
		
		Object[] temp = Arrays.copyOf(inetrnal, inetrnal.length + 1);

	}

	public boolean isEmpty() {
		return false;
	}

}
