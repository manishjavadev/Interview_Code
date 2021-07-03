package com.manish.javadev.sorting;

import java.util.Arrays;

public class KthHigestNumberInArray {
	public static void main(String[] args) {
		// int arr[] = { 11, 12, 13, 5, 6, 7, 14 };
		int arr[] = { 14, 12, 13, 5, 6, 7, 11 };

		System.out.println(Arrays.toString(arr));
		int result = findSecondHigestNumber(arr);
		System.out.println("Result :::" + result);

	}

	private static int findSecondHigestNumber(int[] arr) {

		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			build_maxheap(arr, i, 0);
		}
		for (int i = arr.length - 1; i >= arr.length - 3 + 1; i--) {
			swap(arr, i, 0);
			build_maxheap(arr, i, 0);
		}
		return arr[0];
	}

	private static void build_maxheap(int[] arr, int size, int crr) {
		int largest = crr;
		int left = 2 * crr + 1;
		int right = 2 * crr + 2;
		if (left < size && arr[left] > arr[largest]) {
			largest = left;
		}
		if (right < size && arr[right] > arr[largest]) {
			largest = right;
		}
		if (crr != largest) {
			swap(arr, largest, crr);
			build_maxheap(arr, size, largest);
		}

	}

	private static void swap(int[] arr, int largest, int crr) {
		int temp = arr[largest];
		arr[largest] = arr[crr];
		arr[crr] = temp;

	}
}
