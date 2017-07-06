package com.manish.javadev.geeks.array;

public class BinarySearch {
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int number = 10;
		int result = binarySearch.binarySearch(arr, 0, arr.length - 1, number);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	int binarySearch(int arr[], int low, int high, int x) {
		if (high >= low) {
			int mid = low + (high - low) / 2;

			// If the element is present at the middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then it can only
			// be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, low, mid - 1, x);

			// Else the element can only be present in right
			// subarray
			return binarySearch(arr, mid + 1, high, x);
		}

		// We reach here when element is not present in array
		return -1;
	}
}
