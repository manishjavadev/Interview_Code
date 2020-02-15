package com.manish.javadev.geeks.array.rotation;

public class FindMaxSubArraySumBasics {
	// Naive function to find maximum length sub-array with sum S present
	// in the given array
	public static void maxLengthSubArray(int[] arr, int baseSum) {
		// len stores the maximum length of sub-array with sum S
		int len = 0;

		// stores ending index of maximum length sub-array having sum S
		int ending_index = -1;

		// consider all sub-arrays starting from i
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			// consider all sub-arrays ending at j
			for (int j = i; j < arr.length; j++) {
				// sum of elements in current sub-array
				sum += arr[j];

				// if we have found a sub-array with sum S
				if (sum == baseSum) {
					// update length & ending index of max length subarray
					if (j - i + 1 > len ) {
						len = j - i + 1;
						ending_index = j;
					}
				}
			}
		}

		// print the sub-array
		System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");
	}

	// main function
	public static void main(String[] args) {
		int[] arr = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int baseSum = 9;

		maxLengthSubArray(arr, baseSum);
	}
}
