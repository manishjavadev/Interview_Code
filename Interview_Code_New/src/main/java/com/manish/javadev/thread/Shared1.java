package com.manish.javadev.thread;

public class Shared1 {
	boolean evenOddFlag = false;
	int number = 1;

	public synchronized void printEven() {
		if (!evenOddFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Even Thread = " + number++);
		evenOddFlag = false;
		notify();

	}

	public synchronized void printOdd() {
		if (evenOddFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Odd Thread  = " + number++);
		evenOddFlag = true;
		notify();
	}

}
