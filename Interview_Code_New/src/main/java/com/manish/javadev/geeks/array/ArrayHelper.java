package com.manish.javadev.geeks.array;

/**
 * Its a part of merge sort, this code will help you to sort the two part of
 * array which we are supplying in this method
 * 
 * @author kmamani
 *
 */
public class ArrayHelper {
	public static int[] mergePartOfArray(int[] arr, int[] temp, int low, int mid, int high) {
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

		return arr;
	}

}
