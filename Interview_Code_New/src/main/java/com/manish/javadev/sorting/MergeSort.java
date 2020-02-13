package com.manish.javadev.sorting;

import java.util.Arrays;

public class MergeSort {
	int temp[];

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		ms.doSorting();
	}

	private void doSorting() {
		int arr[] = { 5, 4, 3, 1, 2, 6 };
		temp = new int[arr.length];
		int len = arr.length - 1;
		merge_sort(arr, 0, len);
		System.out.println("Sorted Array " + Arrays.toString(arr));
	}

	private void merge_sort(int[] arr, int low, int high) {
		if (low != high) {
			int mid = (low + high) / 2;
			merge_sort(arr, low, mid);
			merge_sort(arr, mid + 1, high);
			mergePartOfArray(arr, low, mid, high);
		}
	}

	private void mergePartOfArray(int arr[], int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		long count = 0;
		while ((i <= mid) && (j <= high)) {
			if (arr[i] > arr[j]) {
				temp[k++] = arr[j++];
				count += (mid + 1) - i;
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
		System.out.println("count = " + count);
	}
}
