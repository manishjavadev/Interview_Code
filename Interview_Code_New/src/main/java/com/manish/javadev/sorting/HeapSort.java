package com.manish.javadev.sorting;

import java.util.Arrays;

/**
 * You have a max heap now sort the array using heap sort
 * 
 * @author Manish Srivastava
 *
 */
public class HeapSort {

	public static void main(String[] args) {
		int[] array = { 48, 32, 46, 29, 10 };
		// int array[] = { 11, 12, 13, 5, 6, 7, 14 };
		// int array[] = { 72, 64, 65, 56, 32, 46, 54, 29, 48 };
		HeapSort hs = new HeapSort();
		hs.heapSort(array);
	}

	private void heapSort(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			heapify(array, i);
		}
		System.out.println(Arrays.toString(array));
	}

	private void heapify(int[] array, int last) {
		int start = 0;
		swapNode(array, start, last);
		int left = 2 * start + 1;
		int right = 2 * start + 2;

		while (last > right) {
			if (array[start] >= array[left] && array[start] >= array[right]) {
				return;
			}
			if (array[right] <= array[left]) {
				swapNode(array, start, left);
				start = left;
			} else {
				swapNode(array, start, right);
				start = right;
			}
			left = 2 * start + 1;
			right = 2 * start + 2;
		}
		if (left == last - 1 && array[start] < array[left]) {
			swapNode(array, start, left);
		}
	}

	private void swapNode(int[] array, int start, int last) {
		int temp;
		temp = array[start];
		array[start] = array[last];
		array[last] = temp;
	}
}
