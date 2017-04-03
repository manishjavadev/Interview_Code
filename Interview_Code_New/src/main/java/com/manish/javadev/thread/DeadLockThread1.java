package com.manish.javadev.thread;

public class DeadLockThread1 extends Thread {
	DeadLockSharedResources d1 = null;
	DeadLockSharedResources d2 = null;

	public DeadLockThread1(DeadLockSharedResources d1,DeadLockSharedResources d2) {
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
