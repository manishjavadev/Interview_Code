package com.manish.javadev.sorting;

import java.util.Arrays;

public class MergeSort {
	int arr[] = { 5, 4, 3, 1, 2, 6 };
	int temp[] = new int[arr.length];

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		ms.doSorting();
	}

	private void doSorting() {
		int len = arr.length - 1;
		merge_sort(0, len);
		System.out.println("Sorted Array " + Arrays.toString(arr));
	}

	private void merge_sort(int low, int high) {
		if (low != high) {
			int mid = (low + high) / 2;
			merge_sort(low, mid);
			merge_sort(mid + 1, high);
			mergePartOfArray(low, mid, high);
		}
	}

	private void mergePartOfArray(int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		while ((i <= mid) && (j <= high)) {
			if (arr[i] <= arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
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
	}
}
