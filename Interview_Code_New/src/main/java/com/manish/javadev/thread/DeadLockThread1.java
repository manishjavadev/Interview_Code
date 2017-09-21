package com.manish.javadev.thread;

public class DeadLockThread1 extends Thread {
	SharedDeadLock d1 = null;
	SharedDeadLock d2 = null;

	public DeadLockThread1(SharedDeadLock d1,SharedDeadLock d2) {
		this.d1 = d1;
		this.d2 = d2;
	}

	public void run() {
		try {
			d1.test1(d2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
