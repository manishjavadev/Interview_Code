package com.manish.javadev.basic;

public class GCDOFNNumberDemo {
	public static void main(String[] args) {
		GCDOFNNumberDemo gcdDemo = new GCDOFNNumberDemo();
		int arr[] = { 1, 2, 3 };
		int resultGcd = findGcd(arr);
		System.out.println("Result :: " + resultGcd);
	}

	private static int findGcd(int[] arr) {
		int resultNumber = arr[0];
		for (int i = 1; i < arr.length; i++) {
			resultNumber = findGcd(resultNumber, arr[i]);
		}
		return resultNumber;
	}

	private static int findGcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return findGcd(b, a % b);
		}
	}
}
