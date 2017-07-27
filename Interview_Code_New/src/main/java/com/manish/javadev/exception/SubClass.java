package com.manish.javadev.exception;

import java.io.IOException;

public class SubClass extends Super {
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.test1();
	}

	public void test1() {
		try {
			throw new StackOverflowError();
		} catch (Throwable e) {
			System.out.println("StackOverflowError");
		}
	}

	public void test2() throws IOException {
		try {
			throw new StackOverflowError();
		} catch (Throwable e) {
			System.out.println("StackOverflowError");
		}
	}

}
