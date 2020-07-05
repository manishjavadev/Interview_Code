package com.manish.javadev.geeks.array.rotation;

import java.util.Arrays;

public class ReversalAlgorithmLeftArrayRotation {

	/* Driver program to test above functions */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 2;
		// in case the rotating factor is
		// greater than array length
		d = d % n;
		leftRotate(arr, d); // Rotate array by d
		printArray(arr);
	}

	/* Function to left rotate arr[] of size n by d */
	static void leftRotate(int arr[], int d) {
		rvereseArray(arr, 0, d - 1);
		rvereseArray(arr, d, arr.length - 1);
		rvereseArray(arr, 0, arr.length - 1);
	}

	/* Function to reverse arr[] from index start to end */
	static void rvereseArray(int arr[], int start, int end) {
		if (start < end) {
			swapData(arr, start, end);
			rvereseArray(arr, ++start, --end);
		}
	}

	private static void swapData(int[] arr, int start, int end) {
		int temp;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	private static void reverseArrayWithoutRecursion(int[] arr, int start, int end) {
		while (start < end) {
			swapData(arr, start, end);
			start++;
			end--;
		}
	}

	static void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
}
