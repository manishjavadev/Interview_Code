package com.manish.javadev.thread;

public class EvenOddDemo {
	public static void main(String[] args) {
		SharedEvenAndOdd s1 = new SharedEvenAndOdd();

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
