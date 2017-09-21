package com.manish.javadev.thread;

public class DeadLockThread2 extends Thread {
	SharedDeadLock d1 = null;
	SharedDeadLock d2 = null;

	public DeadLockThread2(SharedDeadLock d1,
			SharedDeadLock d2) {
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
