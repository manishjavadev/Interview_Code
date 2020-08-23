package com.manish.javadev.geeks.array.rotation;

/**
 * https://www.geeksforgeeks.org/quickly-find-multiple-left-rotations-of-an-array/
 * 
 * @author kmamani
 *
 */
public class RotateTheArrayFromKIndex {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9 };
		int n = arr.length;

		int k = 2;
		leftRotate(arr, n, k);
		System.out.println();

		k = 3;
		leftRotate(arr, n, k);
		System.out.println();

		k = 4;
		leftRotate(arr, n, k);
		System.out.println();
	}

	/**
	 * Function to left rotate an array k times
	 */

	private static void leftRotate(int arr[], int n, int k) {
		/**
		 * Print array after k rotations
		 */

		for (int i = k; i < n + k; i++) {
			System.out.print(arr[i % n] + " ");
		}

	}
}
