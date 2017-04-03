package com.manish.javadev.thread;

public class EvenThread extends Thread {
	Shared1 s1 = null;
	int index = 0;

	public EvenThread(Shared1 s1) {
		this.s1 = s1;
	}

	public void run() {
		while (index++ < 15) {
			s1.printEven();
		}
	}
}
