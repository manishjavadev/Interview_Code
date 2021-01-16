package com.manish.javadev.geeks.array;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/counting-inversions/
 * 
 * Count Inversions in an array | Set 1 (Using Merge Sort) Inversion Count for
 * an array indicates – how far (or close) the array is from being sorted. If
 * array is already sorted then inversion count is 0. If array is sorted in
 * reverse order that inversion count is the maximum. Formally speaking, two
 * elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j
 * 
 * Example: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4,
 * 3).
 * 
 * 
 * Note that above code modifies (or sorts) the input array. If we want to count
 * only inversions then we need to create a copy of original array and call
 * mergeSort() on copy.
 * 
 * How to get number of inversions in merge()? In merge process, let i is used
 * for indexing left sub-array and j for right sub-array. At any step in
 * merge(), if a[i] is greater than a[j], then there are (mid – i) inversions.
 * because left and right subarrays are sorted, so all the remaining elements in
 * left-subarray (a[i+1], a[i+2] … a[mid]) will be greater than a[j]
 * 
 * Time Complexity: O(nlogn) Algorithmic Paradigm: Divide and Conquer
 * 
 * @author m.d.srivastava
 * 
 */

public class InversionCountUsingMergSort {
	 static int arr[] = { 1, 20, 6, 4, 5 };
	//static int arr[] = { 2, 4, 1, 3, 5 };
	// static int arr[] = { 2, 3, 6, 9, 1 };
	static int temp[] = new int[arr.length];

	public static void main(String... v) {
		InversionCountUsingMergSort ms = new InversionCountUsingMergSort();
		ms.doSorting();
	}

	private void doSorting() {
		int len = arr.length - 1;
		long counter = mergeSort(arr, 0, len);
		System.out.println("Sorted Array " + Arrays.toString(arr));
		System.out.println("Count = " + counter);
	}

	static long mergeSort(int a[], int left, int right) {
		int mid;
		long count = 0;
		if (left < right) {
			mid = (right + left) / 2;
			count = mergeSort(a, left, mid);
			count += mergeSort(a, mid + 1, right);
			count += mergPartofArray(a, left, mid, right);
		}
		return count;
	}

	static long mergPartofArray(int arr[], int low, int mid, int high) {
		int i = low, k = low, j = mid + 1;
		long inversionCounter = 0;
		while (i <= mid && j <= high) {
			if (arr[i] >= arr[j]) {
				temp[k++] = arr[j++];
				inversionCounter += (mid + 1) - i;
			} else {
				temp[k++] = arr[i++];
			}
		}

		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= high) {
			temp[k++] = arr[j++];
		}
		for (i = low; i <= high; i++) {
			arr[i] = temp[i];
		}
		return inversionCounter;
	}
}
