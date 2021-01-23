package com.manish.javadev.thread;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class WaitNotifyDemo {

	public static void main(String[] args) {
		WaitNotifyDemo s1 = new WaitNotifyDemo();
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

	public synchronized void test1() {
		System.out.println("Test1 begin");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Test1 end");
	}

	public synchronized void test2() {
		notify();
	}
}

class Thread1 extends Thread {
	public WaitNotifyDemo s1;

	public Thread1(WaitNotifyDemo s1) {
		this.s1 = s1;
	}

	public void run() {
		s1.test1();
	}

}
