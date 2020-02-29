package com.manish.javadev.geeks.array;

import java.util.Arrays;

/**
 * 
 * http://www.geeksforgeeks.org/counting-inversions/
 * 
 * Inversion Count for an array indicates how far (or close) the array is from
 * being sorted. If array is already sorted then inversion count is 0. If array
 * is sorted in reverse order that inversion count is the maximum. Formally
 * speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i <
 * j
 * 
 * How to get number of inversions in merge()? In merge process, let i is used
 * for indexing left sub-array and j for right sub-array. At any step in
 * merge(), if a[i] is greater than a[j], then there are (mid – i) inversions.
 * because left and right subarrays are sorted, so all the remaining elements in
 * left-subarray (a[i+1], a[i+2] … a[mid]) will be greater than a[j]
 * 
 * Example:
 * 
 * The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
 * 
 * @author m.d.srivastava
 * 
 */
public class CountInversionsByMergeSort {
	int arr[] = { 2, 4, 1, 3, 5 };
	//int arr[] = { 1, 20, 6, 4, 5 };
	int temp[] = new int[arr.length];
	int count = 0;

	public static void main(String[] args) {
		CountInversionsByMergeSort ms = new CountInversionsByMergeSort();
		ms.doSorting();
	}

	private void doSorting() {
		int len = arr.length - 1;
		int count = merge_sort(0, len);
		System.out.println("Sorted Array " + Arrays.toString(arr));
		System.out.println("Count = " + count);
	}

	private int merge_sort(int low, int high) {
		int count = 0;
		if (low < high) {
			int mid = (low + high) / 2;
			count = merge_sort(low, mid);
			count += merge_sort(mid + 1, high);
			count += mergePartOfArray(low, mid, high);
		}
		return count;
	}

	private int mergePartOfArray(int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		int countInversion = 0;
		while ((i <= mid) && (j <= high)) {
			if (arr[i] >= arr[j]) {
				temp[k++] = arr[j++];
				countInversion += (mid + 1) - i;
			} else
				temp[k++] = arr[i++];
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
		return countInversion;
	}
}
