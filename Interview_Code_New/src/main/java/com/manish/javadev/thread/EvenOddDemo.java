package com.manish.javadev.thread;

public class EvenOddDemo {
	public static void main(String[] args) {
		Shared1 s1 = new Shared1();

		EvenThread et = new EvenThread(s1);
		OddThread ot = new OddThread(s1);
		et.start();
		ot.start();
		System.out.println("Done");
	}

}
