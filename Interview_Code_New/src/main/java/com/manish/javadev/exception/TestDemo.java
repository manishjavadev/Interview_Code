package com.manish.javadev.exception;

public class TestDemo {
	public void display() {
		System.out.println("Base class");
	}

	public static void main(String args[]) {
		TestDemo obj1 = new Derived();
		obj1.display();// "Derived Class"
	}
}

class Derived extends TestDemo {
	public void display() {
		System.out.println("Derived Class");
	}
}
