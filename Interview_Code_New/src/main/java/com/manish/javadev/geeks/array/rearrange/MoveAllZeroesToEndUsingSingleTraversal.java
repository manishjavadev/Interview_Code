package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

public class MoveAllZeroesToEndUsingSingleTraversal {
	public static void main(String args[]) {
		int arr[] = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int n = arr.length;

		System.out.print("Original array: ");
		printArray(arr);

		moveZerosToEnd(arr, n);

		System.out.print("\nModified array: ");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));

	}

	static void moveZerosToEnd(int arr[], int n) {
		int count = 0;
		int temp;
		for (int i = 0; i < n; i++) {
			if ((arr[i] != 0)) {
				temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count = count + 1;
			}
		}
	}
}
