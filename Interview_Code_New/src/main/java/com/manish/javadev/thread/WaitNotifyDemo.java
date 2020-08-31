package com.manish.javadev.thread;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class WaitNotifyDemo {
	public static void main(String[] args) {
		WaitNotify s1 = new WaitNotify();
		Thread1 t1 = new Thread1(s1);
		t1.start();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After 20 Second");
		s1.test2();
		System.out.println("Done");
	}

}
