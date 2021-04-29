
package com.manish.javadev.leetcode.array.copy;

import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=fnbImb8lo88
 * 
 * Quick Sort using last element of array as pivot
 * 
 * @author Manish Srivastava
 *
 */
public class QuickSelectUsingQuickSort {

	public static void main(String[] args) {
		// int arr[] = { 9, 0, 5, 2, 6, 1, 3, 4 };
		int arr[] = { 12, 3, 5, 7, 4, 19, 26 };
		int k = 7;
		int quickSort = quickSort(arr, 0, arr.length - 1, k - 1);
		System.out.println(Arrays.toString(arr));
		System.out.println("Result : " + arr[quickSort + 1]);
	}

	private static int quickSort(int arr[], int low, int high, int k) {
		if (low < high) {
			int q = partition(arr, low, high);
			if (q + 1 == k) {
				return q;
			}
			if (q > k) {
				return quickSort(arr, low, q - 1, k);
			} else {
				return quickSort(arr, q + 1, high, k);
			}
		}
		return -1;
	}

	private static int partition(int[] arr, int low, int high) {
		int pivote = arr[high];
		int i = low - 1;
		for (int j = low; j <= high; j++) {
			if (arr[j] < pivote) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, high, i + 1);
		return i;
	}

	private static void swap(int[] arr, int first, int last) {
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}
}
