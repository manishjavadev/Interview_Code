package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

public class MoveAllNegativeNumbersToEnd {
	public static void main(String args[]) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, -9 };
		//int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };

		rearrange(arr);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	private static void rearrange(int[] arr) {
		int j = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				j++;
				swap(arr, j, i);
			}
		}
	}

	private static void swap(int[] arr, int j, int i) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
