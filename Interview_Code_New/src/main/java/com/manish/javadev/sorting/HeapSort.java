package com.manish.javadev.sorting;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		// int[] array = { 48, 32, 46, 29, 10 };
		// int array[] = { 11, 12, 13, 5, 6, 7, 14 };
		int array[] = { 72, 64, 65, 56, 32, 46, 54, 29, 48 };
		HeapSort hs = new HeapSort();
		hs.heapSort(array);
	}

	private void heapSort(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			swapNode(array, i, 0);
			heapify(array, i, 0);
		}
		System.out.println(Arrays.toString(array));
	}

	private void heapify(int[] array, int size, int crr) {
		int left = 2 * crr + 1;
		int right = 2 * crr + 2;

		while (right < size) {
			if (array[crr] >= array[left] && array[crr] >= array[right]) {
				return;
			}
			if (array[right] <= array[left]) {
				swapNode(array, crr, left);
				crr = left;
			} else {
				swapNode(array, crr, right);
				crr = right;
			}
			left = 2 * crr + 1;
			right = 2 * crr + 2;
		}
		if (left == size - 1 && array[crr] < array[left]) {
			swapNode(array, crr, left);
		}
	}

	private void swapNode(int[] array, int start, int last) {
		int temp;
		temp = array[start];
		array[start] = array[last];
		array[last] = temp;
	}
}
