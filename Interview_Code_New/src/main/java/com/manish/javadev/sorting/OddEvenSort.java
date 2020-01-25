package com.manish.javadev.sorting;

/**
 * https://www.geeksforgeeks.org/odd-even-sort-brick-sort/
 * 
 * Odd-Even Sort / Brick Sort This is basically a variation of bubble-sort. This
 * algorithm is divided into two phases- Odd and Even Phase. The algorithm runs
 * until the array elements are sorted and in each iteration two phases occurs-
 * Odd and Even Phases.
 * 
 * In the odd phase, we perform a bubble sort on odd indexed elements and in the
 * even phase, we perform a bubble sort on even indexed elements.
 * 
 * @author kmamani
 *
 */
public class OddEvenSort {
	public static void oddEvenSort(int arr[], int n) {
		boolean isSorted = false; // Initially array is unsorted

		while (!isSorted) {
			isSorted = true;
			// Perform Bubble sort on odd indexed element
			for (int i = 1; i <= n - 2; i = i + 2) {
				if (arr[i] > arr[i + 1]) {
					isSorted = SwapData(arr, i);
				}
			}

			// Perform Bubble sort on even indexed element
			for (int i = 0; i <= n - 2; i = i + 2) {
				if (arr[i] > arr[i + 1]) {
					isSorted = SwapData(arr, i);
				}
			}
		}

		return;
	}

	private static boolean SwapData(int[] arr, int i) {
		boolean isSorted;
		int temp;
		temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
		isSorted = false;
		return isSorted;
	}

	public static void main(String[] args) {
		// int arr[] = { 34, 2, 10, -9 };
		int arr[] = { 3, 2, 3, 8, 5, 6, 4, 1 };
		int n = arr.length;

		oddEvenSort(arr, n);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		System.out.println(" ");
	}
}
