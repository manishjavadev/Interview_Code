package com.manish.javadev.geeks.array.rotation;

import java.util.Arrays;

public class PairSum1 {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 45, 6, 10, -8 };
		int sum = 50;
		boolean printpairs = printpairs(arr, sum);
		System.out.println("Sum is avilable " + printpairs);
	}

	private static boolean printpairs(int arr[], int sum) {
		int high = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < high; ++i) {
			if (arr[i] + arr[high - 1] == sum) {
				return true;
			}
			if (arr[i] + arr[high - 1] < sum) {
				i++;
			} else {
				high--;
			}
		}
		return false;
	}
}
