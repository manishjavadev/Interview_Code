package com.manish.javadev.geeks.array.rotation;

/**
 * Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
 * 
 * Output: true There is a pair (6, 10) with sum 16
 * 
 * Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
 * 
 * Output: true There is a pair (26, 9) with sum 35
 * 
 * Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
 * 
 * Output: false There is no pair with sum 45.
 * 
 * @author kmamani
 *
 */
public class PairInSortedRotated2 {
	public static void main(String[] args) {
		int arr[] = {11, 15, 26, 38, 9, 10};
		int sum = 35;
		int n = arr.length;

		if (pairInSortedRotated(arr, n, sum))
			System.out.print("Array has two elements" + " with sum " + sum);
		else
			System.out.print("Array doesn't have two" + " elements with sum " + sum);
	}

	// This function returns true if arr[0..n-1]
	// has a pair with sum equals to x.
	static boolean pairInSortedRotated(int arr[], int n, int sum) {
		// Find the pivot element

		int mid = findPivot(arr, 0, arr.length - 1);

		int l = mid; // l is now index of
						// smallest element

		int r = mid - 1; // r is now index of largest
							// element

		// Keep moving either l or r till they meet
		while (l != r) {
			// If we find a pair with sum x, we
			// return true
			if (arr[l] + arr[r] == sum)
				return true;

			// If current pair sum is less, move
			// to the higher sum
			if (arr[l] + arr[r] < sum)
				l = (l + 1) % n;

			else // Move to the lower sum side
				r = (n + r - 1) % n;
		}
		return false;
	}

	private static int findPivot(int[] arr, int low, int high) {
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
