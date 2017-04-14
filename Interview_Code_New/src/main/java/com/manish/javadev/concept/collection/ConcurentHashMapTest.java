package com.manish.javadev.concept.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		Map<String, Integer> syncMap = Collections.synchronizedMap(hashMap);
		MyThread1 thread1 = new MyThread1(syncMap);
		MyThread2 thread2 = new MyThread2(syncMap);
		MyThread3 thread3 = new MyThread3(syncMap);
		MyThread4 thread4 = new MyThread4(syncMap);

		for (Map.Entry<String, Integer> e : syncMap.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

		thread1 = new MyThread1(syncMap);
		thread2 = new MyThread2(syncMap);
		thread3 = new MyThread3(syncMap);
		thread4 = new MyThread4(syncMap);
		System.out.println("Done");

	}
}

class MyThread1 implements Runnable {

	Map<String, Integer> map;

	public MyThread1(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHelper1").start();
	}

	public void run() {
		map.put("One", 1);
		try {
			System.out.println("MapHelper2 sleeping");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}

class MyThread2 implements Runnable {

	Map<String, Integer> map;

	public MyThread2(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHelper2").start();
	}

	public void run() {
		map.put("Two", 2);
		try {
			System.out.println("MapHelper2 sleeping");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}

class MyThread3 implements Runnable {

	Map<String, Integer> map;

	public MyThread3(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHelper3").start();
	}

	public void run() {
		map.put("Three", 3);
		try {
			System.out.println("MapHelper3 sleeping");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}

class MyThread4 implements Runnable {

	Map<String, Integer> map;

	public MyThread4(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHelper4").start();
	}

	public void run() {
		map.put("Four", 4);
		try {
			System.out.println("MapHelper4 sleeping");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}

class MapHelper5 implements Runnable {

	Map<String, Integer> map;

	public MapHelper5(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHelper5").start();
	}

	public void run() {
		map.put("Five", 5);
		try {
			System.out.println("MapHelper5 sleeping");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}