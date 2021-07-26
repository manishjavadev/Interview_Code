package com.manish.javadev.thread.blockingqueue;

public class SharedPrinter3ThreadDemo {

	final static int NUMBERS_IN_SEQUENCE = 10;
	final static int NUMBER_OF_THREADS = 3;

	public static void main(String[] args) {
		// Shared object
		SharedPrinter3Thread sp = new SharedPrinter3Thread(NUMBERS_IN_SEQUENCE, NUMBER_OF_THREADS);
		// Creating 3 threads
		Thread t1 = new Thread(new SeqRunnable(sp, 1), "T1");
		Thread t2 = new Thread(new SeqRunnable(sp, 2), "T2");
		Thread t3 = new Thread(new SeqRunnable(sp, 0), "T3");

		t1.start();
		t2.start();
		t3.start();
	}
}
