package com.manish.javadev.thread;

public class DeadLockThread2 extends Thread {
	DeadLockSharedResources d1 = null;
	DeadLockSharedResources d2 = null;

	public DeadLockThread2(DeadLockSharedResources d1,
			DeadLockSharedResources d2) {
		this.d1 = d1;
		this.d2 = d2;
	}

	public void run() {
		try {
			d2.test2(d1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
