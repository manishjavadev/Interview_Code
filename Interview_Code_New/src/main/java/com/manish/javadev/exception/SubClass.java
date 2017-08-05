package com.manish.javadev.exception;


public class SubClass extends Super {
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		try {
			sc.test1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void test1() {
		try {
			return;
		} catch (Exception ex) {
			System.out.println("StackOverflowError");
		}
	}

	public void test2() {
		try {
			throw new StackOverflowError();
		} catch (Throwable e) {
			System.out.println("StackOverflowError");
		}
	}

}
