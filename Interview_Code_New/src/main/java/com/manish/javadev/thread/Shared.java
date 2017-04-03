package com.manish.javadev.thread;

public class Shared {
	public synchronized void test1() {
		System.out.println("Test1 begin");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test1 end");
	}

	public synchronized void test2() {
		notify();
	}

}
