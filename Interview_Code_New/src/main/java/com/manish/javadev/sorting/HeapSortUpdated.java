package com.manish.javadev.sorting;

import java.util.Arrays;

public class HeapSortUpdated {

	public static void main(String[] args) {
		int[] array = { 48, 32, 46, 29, 10 };
		HeapSortUpdated hs = new HeapSortUpdated();
		hs.heapSort(array);
	}

	private void heapSort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			swapNode(array, i, 0);
			heapify(array, i, 0);
		}
		System.out.println(Arrays.toString(array));
	}

	private void heapify(int[] array, int size, int crr) {
		int large = crr;
		int left = 2 * large + 1;
		int right = 2 * large + 2;

		while (right < size) {
			if (array[right] < array[left]) {
				large = left;
			} else {
				large = right;
			}
			if (large != crr) {
				swapNode(array, crr, large);
				left = 2 * large + 1;
				right = 2 * large + 2;
			}
		}
		/**
		 * Why this condition is required
		 * 
		 * 1) once u are going to process right child at index "2" means n
		 * values goes 2 after all operation, that time your array become
		 * 
		 * 10,29, 32,46,48
		 * 
		 * one n reach to 1, then left = 1 and right become 2, while(2<2)
		 * condition will not be executed and 1==0 that if block also failed, so
		 * array become like below
		 * 
		 * 29,10, 32,46,48 which is wrong
		 * 
		 * if i==2, so left will equal to size -1 (left == size - 1) and
		 * array[large] < array[left] swap it, so once u process i==1, mean size
		 * ==1, after swap our and will become like below 10,29, 32,46,48 which
		 * is sorted array
		 * 
		 */
		if (left == size - 1 && array[large] < array[left]) {
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
