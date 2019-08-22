package com.manish.javadev.geeks.array.rotation;

public class FindPivoteInSortedRotatedArrayUsingBinarySearch {
	public static void main(String[] args) {
		int arr[] = { 11, 15, 6, 8, 9, 10 };
		int result = findPivot(arr, 0, arr.length - 1);
		System.out.println("Pivote Element :: " + result);
	}

	static int findPivot(int arr[], int low, int high) {
		if (arr[0] < arr[arr.length - 1]) {
			return -1;
		}
		if (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > arr[mid + 1])
				return mid + 1;

			if (arr[low] <= arr[mid])
				return findPivot(arr, mid + 1, high);
			return findPivot(arr, low, mid - 1);
		}
		return -1;
	}

}
