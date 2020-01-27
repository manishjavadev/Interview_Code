package com.manish.javadev.sorting;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] array = { 48, 32, 46, 29, 10 };
		HeapSort hs = new HeapSort();
		hs.heapSort(array);
	}

	private void heapSort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			doSorting(array, i, 0);
		}
		System.out.println(Arrays.toString(array));
	}

	private void doSorting(int[] array, int n, int i) {
		int large = i;
		int left = 2 * large + 1;
		int right = 2 * large + 2;
		swapNode(array, n, 0);

		while (right < n) {
			if (array[large] >= array[left] && array[large] >= array[right]) {
				return;
			}
			if (array[right] <= array[left]) {
				swapNode(array, large, left);
				large = left;
			} else {
				swapNode(array, large, right);
				large = right;
			}
			left = 2 * large + 1;
			right = 2 * large + 2;
		}
		if (left == n - 1 && array[large] < array[left]) {
			swapNode(array, large, left);
		}
	}

	private void swapNode(int[] array, int start, int left) {
		int temp;
		temp = array[start];
		array[start] = array[left];
		array[left] = temp;
	}
}
