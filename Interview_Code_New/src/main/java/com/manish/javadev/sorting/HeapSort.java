package com.manish.javadev.sorting;

import java.util.Arrays;

public class HeapSort {
	int[] array = { 48, 32, 46, 29 };

	public static void main(String[] args) {
		HeapSort hs = new HeapSort();
		hs.heapSort();
	}

	private void heapSort() {
		for (int i = array.length - 1; i > 0; i--) {
			doSorting(i);
		}
		System.out.println(Arrays.toString(array));
	}

	private void doSorting(int last) {
		int start = 0;
		int temp;
		int left = 0;
		int right = 0;
		temp = array[start];
		array[start] = array[last];
		array[last] = temp;
		left = 2 * start + 1;
		right = 2 * start + 2;
		while (right < last) {
			if (array[start] >= array[left] && array[start] >= array[right]) {
				return;
			}
			if (array[right] <= array[left]) {
				temp = array[start];
				array[start] = array[left];
				array[left] = temp;
				start = left;
			} else {
				temp = array[start];
				array[start] = array[right];
				array[right] = temp;
				start = right;
			}
			left = 2 * start + 1;
			right = 2 * start + 2;
		}
		if (left == last - 1 && array[start] < array[left]) {
			temp = array[start];
			array[start] = array[left];
			array[left] = temp;
		}
	}
}
