package com.manish.javadev.thread;

public class EvenThread extends Thread {
	SharedEvenAndOdd s1 = null;
	int index = 0;

	public EvenThread(SharedEvenAndOdd s1) {
		this.s1 = s1;
	}

	public void run() {
		while (index++ < 13) {
			s1.printEven();
		}
	}
}
