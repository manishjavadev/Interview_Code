package com.manish.javadev.geeks.array.rotation;

public class FindMinimumElementSortedRotatedArray {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int result = findPivot(arr, 0, arr.length - 1);
		System.out.println("Pivote Element :: " + result);
		if (result > 0) {
			System.out.println("Minimum Element is " + arr[result]);
		} else {
			System.out.println("Minimum Element is " + arr[0]);
		}

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
