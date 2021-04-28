package com.manish.javadev.exception;

import java.io.FileNotFoundException;

public class SubClass implements Super {
	public static void main(String[] args) {
		Super sc = new SubClass();
		try {
			sc.test1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void test1() throws FileNotFoundException {
		try {
			throw new FileNotFoundException();
		} catch (NullPointerException ex) {
			System.out.println("StackOverflowError");
		}
	}

	public void test2() {
		try {
			throw new StackOverflowError();
		} catch (Throwable e) {
			System.out.println("StackOverflowError");
			test2();
		}
	}

}
