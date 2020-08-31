package com.manish.javadev.thread;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class OddThread extends Thread {
	SharedEvenAndOdd s1 = null;
	int index = 0;

	public OddThread(SharedEvenAndOdd s1) {
		this.s1 = s1;
	}

	public void run() {
		while (index++ < 13) {
			s1.printOdd();
		}
	}
}
