package com.manish.javadev.geeks.array.rotation;

public class FindMaxSubArraySumBasics {
	// Naive function to find maximum length sub-array with sum S present
	// in the given array
	public static void maxLengthSubArray(int[] arr, int baseSum) {
		// len stores the maximum length of sub-array with sum S
		int maxLen = 0;

		// stores ending index of maximum length sub-array having sum S
		int end = -1;

		// consider all sub-arrays starting from i
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == baseSum) {
					// update length & ending index of max length subarray
					if (j - i + 1 > maxLen) {
						maxLen = j - i + 1;
						end = j;
					}
				}
			}
		}

		// print the sub-array
		System.out.println("[" + (end - maxLen + 1) + ", " + end + "]");
	}

	// main function
	public static void main(String[] args) {
		int[] arr = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int baseSum = 9;

		maxLengthSubArray(arr, baseSum);
	}
}
