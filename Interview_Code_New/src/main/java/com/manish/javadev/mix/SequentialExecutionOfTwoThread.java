package com.manish.javadev.mix;

/**
 * @author Priyanka Sep 19, 2013 12:44:12 AM
 */
public class SequentialExecutionOfTwoThread implements Runnable {
	int j = 0;
	char ch = 'A';

	public SequentialExecutionOfTwoThread() {
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			if (j == 0) {
				System.out.println((char) (ch));
			} else {
				System.out.println((char) (ch + j));
			}
			j++;
		}
	}

	public static void main(String[] args) {
		SequentialExecutionOfTwoThread se = new SequentialExecutionOfTwoThread();
		for (int i = 0; i < 1; i++) {
			Thread t1 = new Thread(se);
			Thread t2 = new Thread(se);
			t1.start();

			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t2.start();
			try {
				t2.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
