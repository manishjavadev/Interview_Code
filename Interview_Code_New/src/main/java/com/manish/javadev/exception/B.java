package com.manish.javadev.exception;

import java.io.FileNotFoundException;

public class B extends A {
	public void m1() throws FileNotFoundException {
		System.out.println("m1 of A() throws IOException");
	}
}
