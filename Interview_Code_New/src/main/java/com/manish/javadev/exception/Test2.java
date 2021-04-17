package com.manish.javadev.exception;

public class Test2 {
	static int var1 = 30;

	public static void main(String[] args) {

		print1();
		print2();
	}

	static void print1() {
		int var2 = var1;
		var1++;// 30
		print(var2);// 40
	}

	static void print2() {
		int var2 = var1++;// 31
		System.out.println(var2);// 31
		print(var2);// 31
	}

	static void print(int a) {
		System.out.println(a);// 40//31
	}
}
