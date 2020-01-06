package com.manish.javadev.thread;

public class DeadLockThread2 extends Thread {
	SharedDeadLock s1 = null;
	SharedDeadLock s2 = null;

	public DeadLockThread2(SharedDeadLock s1, SharedDeadLock s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		try {
			s2.test2(s1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
