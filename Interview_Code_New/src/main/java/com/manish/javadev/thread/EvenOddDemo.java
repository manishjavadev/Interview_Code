package com.manish.javadev.thread;

public class EvenOddDemo {
	public static void main(String[] args) {
		Shared1 s1 = new Shared1();

		EvenThread et = new EvenThread(s1);
		OddThread ot = new OddThread(s1);
		et.start();
		ot.start();
		try {
			et.join();
			ot.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Done");
	}

}
