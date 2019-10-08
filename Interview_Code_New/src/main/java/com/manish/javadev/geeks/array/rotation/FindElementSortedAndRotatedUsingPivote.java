package com.manish.javadev.geeks.array.rotation;

/**
 * https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 * An element in a sorted array can be found in O(log n) time via binary search.
 * But suppose we rotate an ascending order sorted array at some pivot unknown
 * to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise
 * a way to find an element in the rotated array in O(log n) time.
 * 
 * Input : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; key = 3 Output : Found at index
 * 8
 * 
 * Input : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; key = 30 Output : Not found
 * 
 * Input : arr[] = {30, 40, 50, 10, 20} key = 10 Output : Found at index 3
 * 
 * 
 * All solutions provided here assume that all elements in array are distinct.
 * ===========================================================================
 * The idea is to find the pivot point, divide the array in two sub-arrays and
 * call binary search. The main idea for finding pivot is � for a sorted (in
 * increasing order) and pivoted array, pivot element is the only element for
 * which next element to it is smaller than it. Using above criteria and binary
 * search methodology we can get pivot element in O(logn) time
 * 
 * @author kmamani
 *
 */
public class FindElementSortedAndRotatedUsingPivote {

	// main function
	public static void main(String args[]) {
		// Let us search 3 in below array
		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int n = arr.length;
		int key = 7;
		System.out.println("Index of the element is : " + pivotedBinarySearch(arr, n, key));
	}

	/*
	 * Searches an element key in a pivoted sorted array arrp[] of size n
	 */
	static int pivotedBinarySearch(int arr[], int n, int key) {
		int pivot = findPivot(arr, 0, n - 1);
		// If we didn't find a pivot, then
		// array is not rotated at all
		if (pivot == -1)
			return binarySearch(arr, 0, n - 1, key);

		// If we found a pivot, then first
		// compare with pivot and then
		// search in two sub arrays around pivot
		if (arr[pivot] == key)
			return pivot;
		if (arr[pivot] > key)
			return binarySearch(arr, 0, pivot - 1, key);
		return binarySearch(arr, pivot + 1, n - 1, key);
	}

	private static int binarySearch(int arr[], int low, int high, int key) {
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

	/*
	 * Pivote: means minimum element of array(index of 1) Pivote: means maximum
	 * element of array(index of 6) implemented for minimum element of array
	 * Function to get pivot. For array 3, 4, 5, 6, 1, 2 it returns 4 (index of
	 * 1)
	 * 
	 * Algorithm/Insights:
	 * 
	 * Use modified binary search to find pivot element:
	 * 
	 * 1. If array[0] <= array[length of array - 1], it means the array is not
	 * rotated, so return -1.
	 * 
	 * 2. Initialize start = 0, end = length of array - 1.
	 * 
	 * 3. Repeat following steps till start <= end
	 * 
	 * a). Set mid = (start+end)/2.
	 * 
	 * b). If mid+1 is pivot, then break.
	 * 
	 * c). If array[start] <= array[mid], it means from start to mid, all
	 * elements are in sorted order. Set start = mid+1, so that we look for
	 * pivot in second half of the array.
	 * 
	 * d). Else set end = mid-1, to look for pivot in first half.
	 */
	static int findPivot(int arr[], int low, int high) {
		if (arr[0] <= arr[arr.length - 1]) {
			return -1;
		}
		if (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > arr[mid + 1])
				return mid;
			if (arr[low] <= arr[mid])
				return findPivot(arr, mid + 1, high);
			return findPivot(arr, low, mid - 1);
		}
		return -1;
	}

}
