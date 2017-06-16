package com.manish.javadev.thread;

public class SharedEvenAndOdd {
	boolean evenOddFlag = false;
	int number = 0;
	char ch = 'A';

	public synchronized void printEven() {
		if (!evenOddFlag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Even Thread = " + (char) (ch + number++));
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
		System.out.println("Odd Thread  = " + (char) (ch + number++));
		evenOddFlag = true;
		notify();
	}

}
