package com.manish.javadev.interview.inhertance;

public class Sub extends Super {
	String name = "Vishnu";
	int age = 22;

	public static void main(String args[]) {
		new Sub().display();
	}

	public static void test1() {
		System.out.println(" Test1 from Sub");
	}

	public void display() {
		Super obj = new Sub();
		Sub sub1 = (Sub)obj;
		System.out.println("Name: " + sub1.name);
		System.out.println("age: " + sub1.age);
		sub1.test1();
	}
}
