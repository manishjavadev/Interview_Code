package com.manish.javadev.geeks.array.rotation;

public class PrintLeftRotationOfArrayInOnTimeAndO1Space {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9 };
		int n = arr.length;

		int k = 2;
		leftRotate(arr, n, k);

		k = 3;
		leftRotate(arr, n, k);

		k = 4;
		leftRotate(arr, n, k);
	}

	static void leftRotate(int arr[], int len, int k) {
		/**
		 * To get the starting point of rotated array
		 */
		int startIndex = k % len;
		/**
		 * Prints the rotated array from start position
		 */
		for (int i = 0; i < len; ++i) {
			int index = (i + startIndex) % len;
			System.out.print(arr[index] + " ");
		}

		System.out.println();
	}

}
