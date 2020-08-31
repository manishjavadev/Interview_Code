
package com.manish.javadev.sorting;

import java.util.Arrays;

/**
 * Quick Sort using last element of array as pivot
 * 
 * @author Manish Srivastava
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 6, 1, 3, 4 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			// The index of pivot element is same as in sorted array and in
			// Portioned array
			int q = partition(arr, low, high);
			quickSort(arr, low, q - 1);
			quickSort(arr, q + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivote = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivote) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, high, i + 1);
		return i + 1;
	}

	private static void swap(int[] arr, int first, int last) {
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}
}
