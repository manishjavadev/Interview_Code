package com.manish.javadev.thread;

public class ThreadComunicationDemo {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Thread1 t1 = new Thread1(s1);
		t1.start();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After 20 Second");
		s1.test2();
		System.out.println("Done");
	}

}
