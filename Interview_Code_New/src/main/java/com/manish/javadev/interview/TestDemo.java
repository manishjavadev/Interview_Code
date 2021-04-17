package com.manish.javadev.interview;

public class TestDemo {
	public static void display() {
		System.out.println("Base class");
	}

	public static void main(String args[]) {
		TestDemo obj1 = new Derived();
		obj1.display();// "Derived Class"
	}
}

class Derived extends TestDemo {
	public static void display() {
		System.out.println("Derived Class");
	}
}
