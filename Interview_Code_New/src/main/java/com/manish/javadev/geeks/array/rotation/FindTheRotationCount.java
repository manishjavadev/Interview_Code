package com.manish.javadev.geeks.array.rotation;

/**
 * Consider an array of distinct numbers sorted in increasing order. The array
 * has been rotated (clockwise) k number of times. Given such an array, find the
 * value of k.
 * 
 * Examples:
 * 
 * Input : arr[] = {15, 18, 2, 3, 6, 12} Output: 2 Explanation : Initial array
 * must be {2, 3, 6, 12, 15, 18}. We get the given array after rotating the
 * initial array twice.
 * 
 * Input : arr[] = {7, 9, 11, 12, 5} Output: 4
 * 
 * Input: arr[] = {7, 9, 11, 12, 15}; Output: 0
 * 
 * 
 * @author kmamani
 *
 */
public class FindTheRotationCount {

	// Driver program to test above functions
	public static void main(String[] args) {
		// int arr[] = { 15, 18, 2, 3, 6, 12 };
		int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int n = arr1.length;

		System.out.println(countRotations(arr1, 0, n - 1));
	}

	// Returns count of rotations for an
	// array which is first sorted in
	// ascending order, then rotated
	static int countRotations(int arr[], int n) {
		// We basically find index of minimum
		// element
		int min = arr[0], min_index = -1;
		for (int i = 0; i < n; i++) {
			if (min > arr[i]) {
				min = arr[i];
				min_index = i;
			}
		}
		return min_index;
	}

	/**
	 * Time Complexity : O(Log n) Auxiliary Space : O(1) if we use iterative
	 * Binary Search is used (Readers can refer Binary Search article for
	 * iterative Binary Search)
	 * 
	 * This article is contributed by Rakesh Kumar. If you like GeeksforGeeks
	 * and would like to contribute, you can also write an article using
	 * contribute.geeksforgeeks.org or mail your article to
	 * contribute@geeksforgeeks.org. See your article appearing on the
	 * GeeksforGeeks main page and help other Geeks.
	 * 
	 * Please write comments if you find anything incorrect, or you want to
	 * share more information about the topic discussed above.
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */

	// Returns count of rotations for an array
	// which is first sorted in ascending order,
	// then rotated
	static int countRotations(int arr[], int low, int high) {
		// base cases
		if (arr[0] <= arr[arr.length - 1]) {
			return 0;
		}

		/* low + (high - low)/2; */
		int mid = (low + high) / 2;
		if (low < mid && arr[mid] < arr[mid - 1])
			return mid;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid + 1;
		/**
		 * If arr[0]>arr[length-1] is greater then means array is sorted rotated
		 * in between this, so go for pivote in between
		 */
		if (arr[low] >= arr[mid])
			return countRotations(arr, low, mid - 1);
		return countRotations(arr, mid + 1, high);
	}
}
