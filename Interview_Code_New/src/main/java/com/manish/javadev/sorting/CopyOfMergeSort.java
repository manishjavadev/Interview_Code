package com.manish.javadev.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyOfMergeSort {
	int arr[] = { 3, 5, 7, 2, 2, 5, 7, 7 };
	int temp[] = new int[arr.length];
	static List list = new ArrayList();

	public static void main(String[] args) {
		CopyOfMergeSort ms = new CopyOfMergeSort();
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
			if (arr[i] == arr[j])
				list.add(arr[i]);
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
