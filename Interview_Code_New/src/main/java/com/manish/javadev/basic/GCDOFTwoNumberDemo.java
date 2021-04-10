package com.manish.javadev.basic;

public class GCDOFTwoNumberDemo {
	public static void main(String[] args) {
		GCDOFTwoNumberDemo gcdDemo = new GCDOFTwoNumberDemo();
		int result = gcdDemo.findGcd(10, 45);
		System.out.println("Result :: " + result);
	}

	private int findGcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return findGcd(b, a % b);
		}
	}
}
