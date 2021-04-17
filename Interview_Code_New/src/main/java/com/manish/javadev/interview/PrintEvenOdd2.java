package com.manish.javadev.interview;

public class PrintEvenOdd2 {

	public static void main(String[] args) {
		PrintEvenOdd shared = new PrintEvenOdd();
		Thread1 t1 = new Thread1(shared);
		Thread2 t2 = new Thread2(shared);
		t1.start();
		t2.start();
	}
}
