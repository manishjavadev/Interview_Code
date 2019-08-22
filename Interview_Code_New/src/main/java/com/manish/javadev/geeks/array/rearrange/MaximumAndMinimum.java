package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Original Array ");
		System.out.println(Arrays.toString(arr));

		arr = rearrange(arr, arr.length);

		System.out.println("Modified Array ");
		System.out.println(Arrays.toString(arr));

	}

	// Prints max at first position, min at second position
	// second max at third position, second min at fourth
	// position and so on.
	static int[] rearrange(int[] arr, int n) {
		// Auxiliary array to hold modified array
		int temp[] = new int[n];

		// Indexes of smallest and largest elements
		// from remaining array.
		int small = 0, large = n - 1;

		// To indicate whether we need to copy rmaining
		// largest or remaining smallest at next position

		// Store result in temp[]
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				temp[i] = arr[large--];
			else
				temp[i] = arr[small++];

		}

		return arr = temp;
	}
}
