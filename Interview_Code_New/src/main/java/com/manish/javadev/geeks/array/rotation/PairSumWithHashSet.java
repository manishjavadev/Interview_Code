package com.manish.javadev.geeks.array.rotation;

import java.util.HashSet;

public class PairSumWithHashSet {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 45, 6, 10, 8 };
		int sum = 16;
		printpairs(arr, sum);
	}

	private static void printpairs(int arr[], int sum) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];
			// checking for condition
			if (temp >= 0 && s.contains(temp)) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
			}
			s.add(arr[i]);
		}
	}
}
