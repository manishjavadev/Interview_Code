package com.manish.javadev.geeks.array.rotation;

import java.util.Arrays;
import java.util.HashSet;

public class PairSumWithHashSet {
	public static void main(String[] args) {
		int arr[] = { 1, 8, 45, 6, 10, 8 };
		reverse(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		// printpairs(arr, sum);
	}

	private static void reverse(int[] arr, int l, int h) {

		if (l < h) {
			swapData(arr, l, h);
		}
	}

	private static void swapData(int[] arr, int l, int h) {
		int tmp = arr[l];
		arr[l] = arr[h];
		arr[h] = tmp;
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
