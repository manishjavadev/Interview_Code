package com.manish.javadev.interview;

public class Sub extends Super {
	String name = "Vishnu";
	int age = 22;

	public static void main(String args[]) {
		new Sub().display();
	}

	public void display() {
		Super obj = new Sub();
		System.out.println("Name: " + obj.name);
		System.out.println("age: " + obj.age);
	}
}
