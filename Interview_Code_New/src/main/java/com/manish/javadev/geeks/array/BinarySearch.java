package com.manish.javadev.geeks.array;

/**
 * Binary Search of array
 * 
 * @author kmamani
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int key = 3;
		int result = binarySearch.binarySearch(arr, 0, arr.length - 1, key);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	int binarySearch(int arr[], int low, int high, int key) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key)
				return mid;
			if (arr[mid] > key)
				return binarySearch(arr, low, mid - 1, key);
			return binarySearch(arr, mid + 1, high, key);
		}
		return -1;
	}
}
