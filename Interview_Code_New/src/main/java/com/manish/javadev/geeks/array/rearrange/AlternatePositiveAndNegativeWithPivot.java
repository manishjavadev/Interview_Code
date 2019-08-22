package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

/**
 * Time Complexity: O(n) where n is number of elements in given array. Auxiliary
 * Space: O(1)
 * 
 * Related Articles: Rearrange positive and negative numbers with constant extra
 * space Move all negative elements to end in order with extra space allowed
 * 
 * For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the
 * output should be [9, -7, 8, -3, 5, -1, 2, 4, 6]
 * 
 * @author kmamani
 *
 */
public class AlternatePositiveAndNegativeWithPivot {

	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int n = arr.length;
		rearrange(arr);
		System.out.println("Array after rearranging: ");
		printArray(arr);
	}

	/**
	 * The main function that rearranges elements of given array. It puts
	 * positive elements at even indexes (0, 2, ..) and negative numbers at odd
	 * indexes (1, 3, ..).
	 * 
	 * @param arr
	 * @param n
	 */
	static void rearrange(int arr[]) {
		/**
		 * The following few lines are similar to partition process of
		 * QuickSort. The idea is to consider 0 as pivot and divide the array
		 * around it.
		 */
		int i = -1, temp = 0, pivot = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < pivot) {
				i++;
				swapData(arr, i, j);
			}
		}

		/**
		 * Now all positive numbers are at end and negative numbers at the
		 * beginning of array.
		 * 
		 * Initialize indexes for starting point of positive and negative
		 * numbers to be swapped
		 */
		int neg = 0, pos = i + 1;

		/**
		 * Increment the negative index by 2 and positive index by 1, i.e.,
		 * 
		 * swap every alternate negative number with next positive number
		 * 
		 */
		while (pos < arr.length && neg < pos && arr[neg] < 0) {
			swapData(arr, neg, pos);
			pos++;
			neg = neg + 2;
		}
	}

	private static void swapData(int[] arr, int i, int j) {
		if (i < j) {
			int temp;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			swapData(arr, ++i, --j);
		}
	}

	// display an array
	static void printArray(int arr[]) {
		System.out.print(Arrays.toString(arr));
	}

}
