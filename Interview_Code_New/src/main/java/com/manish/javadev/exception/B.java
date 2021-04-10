package com.manish.javadev.exception;

import java.io.IOException;

public class B extends A {
	protected void m1(int a) {
		System.out.println("m1 of B() throws IOException");
	}

	public static void main(String[] args) throws IOException {
		A a = new B();
		a.m1(10);
	}
}
