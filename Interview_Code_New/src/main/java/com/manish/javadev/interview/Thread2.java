package com.manish.javadev.interview;

public class Thread2 extends Thread {
	PrintEvenOdd shared;

	public Thread2(PrintEvenOdd shared) {
		this.shared = shared;

	}

	public void run() {
		int index = 0;
		try {
			while (index < 50) {

				shared.printEven();
				index++;
			}
			shared.printOdd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
