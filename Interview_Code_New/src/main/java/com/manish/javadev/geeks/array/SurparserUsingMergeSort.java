package com.manish.javadev.geeks.array;

import java.util.Arrays;
import java.util.HashMap;

public class SurparserUsingMergeSort {
	static int arr[] = { 1, 20, 6, 4, 5 };
	int temArr[] = { 1, 20, 6, 4, 5 };
	int temp[] = new int[arr.length];
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		SurparserUsingMergeSort ms = new SurparserUsingMergeSort();
		ms.doSorting();
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			int tempresult = ((arr.length - 1) - i);
			Integer mapdata = map.get(i);
			if (null == mapdata) {
				mapdata = 0;
			}

			System.out.print(tempresult - mapdata + "\t");
		}
	}

	private void doSorting() {
		int len = arr.length - 1;
		merge_sort(temArr, 0, len);
	}

	private void merge_sort(int[] temArr2, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			merge_sort(temArr, low, mid);
			merge_sort(temArr, mid + 1, high);
			mergePartOfArray(temArr, low, mid, high);
		}
	}

	private void mergePartOfArray(int[] temArr2, int low, int mid, int high) {
		int i, j, k;
		int n1 = mid - low + 1;
		int n2 = high - mid;

		int left[] = new int[n1];
		int right[] = new int[n2];
		/* Copy data to temp arrays L[] and R[] */
		for (i = 0; i < n1; i++)
			left[i] = arr[low + i];

		for (j = 0; j < n2; j++)
			right[j] = arr[mid + 1 + j];

		/* Merge the temp arrays back into arr[l..r] */
		i = 0;
		j = 0;
		k = low;
		int c = 0;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				// increment inversion count of L[i]
				if (map.get(left[i]) == null) {
					map.put(left[i], 0);
				} else {
					map.put(left[i], map.get(left[i]) + c);
				}
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];

				// inversion found
				c++;
			}
		}

		/*
		 * Copy the remaining elements of L[], if there are any
		 */
		while (i < n1) {
			// increment inversion count of L[i]
			if (map.get(left[i]) == null) {
				map.put(left[i], 0);
			} else {
				map.put(left[i], map.get(left[i]) + c);
			}
			arr[k++] = left[i++];
		}
		while (j < n2)
			arr[k++] = right[j++];

	}

}
