package com.manish.javadev.sorting;

import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=e5ik2UGjHBk
 * 
 * OR
 * 
 * https://www.youtube.com/watch?v=TzeBrDU-JaY
 * 
 * @author Manish Srivastava
 *
 */
public class MergeSortDemo {
	int[] arr = { 4, 6, 3, 9, 7, 10 };
	// int arr[] = { 5, 4, 3, 1, 2, 6 };
	int temp[] = new int[arr.length];

	public static void main(String[] args) {
		MergeSortDemo ms = new MergeSortDemo();
		ms.doSorting();
	}

	private void doSorting() {
		System.out.println("Original Array " + Arrays.toString(arr));
		merge_sort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array " + Arrays.toString(arr));
	}

	private void merge_sort(int[] arr, int low, int high) {
		if (low != high) {
			int mid = (low + high) / 2;
			merge_sort(arr, low, mid);
			merge_sort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	private void merge(int[] arr, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		// While1| for both left and right till condition is true
		while ((i <= mid) && (j <= high)) {
			if (arr[i] >= arr[j]) {
				temp[k++] = arr[j++];
			} else {
				temp[k++] = arr[i++];
			}
		}
		// While2| for left part of array
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		// While3 for right part of array
		while (j <= high) {
			temp[k++] = arr[j++];
		}
		for (i = low; i <= high; i++) {
			arr[i] = temp[i];
		}
	}
}
