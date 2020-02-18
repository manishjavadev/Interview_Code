package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

/**
 * 
 * Given an array of random numbers, Push all the zero's of a given array to the
 * end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2,
 * 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The
 * order of all other elements should be same. Expected time complexity is O(n)
 * and extra space is O(1).
 * 
 * Input : arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
 * 
 * Output : arr[] = {1, 2, 4, 3, 5, 0, 0};
 * 
 * Input : arr[] = {1, 2, 0, 0, 0, 3, 6};
 * 
 * Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
 * 
 * @author kmamani
 *
 */
public class MoveAllEvenAndOddTogether {

	public static void main(String args[]) {
		// int arr[] = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;

		System.out.print("Original array: ");
		printArray(arr);

		moveZerosToEnd(arr);

		System.out.print("\nModified array: ");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));

	}

	/**
	 * Use the concept of pivot, let's assume zero at a pivot
	 * 
	 * @param arr
	 */
	static void moveZerosToEnd(int arr[]) {

		int i = -1;
		for (int j = 0; j < arr.length; j++) {
			if ((arr[j] % 2 == 0)) {
				i++;
				swapData(arr, i, j);
			}
		}
	}

	private static void swapData(int[] arr, int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
