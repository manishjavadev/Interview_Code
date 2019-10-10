package com.manish.javadev.geeks.array.rearrange;

/**
 * Given an array, rearrange the array such that :
 * 
 * If index i is even, arr[i] <= arr[i+1]
 * 
 * If index i is odd, arr[i] >= arr[i+1]
 * 
 * https://www.geeksforgeeks.org/rearrange-array-even-index-elements-smaller-odd-index-elements-greater/
 * 
 * Time Complexity :O(n)
 * 
 * @author kmamani
 *
 */
public class EvenIndexElementsAreSmallerAndOddIndexElementsAreGreater {

	public static void main(String[] args) {
		int arr[] = { 6, 4, 2, 1, 8, 3 };
		int n = arr.length;

		System.out.print("Before rearranging: \n");
		printArray(arr, n);

		rearrange(arr, n);

		System.out.print("After rearranging: \n");
		printArray(arr, n);
	}

	private static void rearrange(int arr[], int n) {
		for (int i = 0; i < n - 1; i++) {
			if (i % 2 == 0 && arr[i] > arr[i + 1]) {
				swapData(arr, i);
			}
			if (i % 2 != 0 && arr[i] < arr[i + 1]) {
				swapData(arr, i);
			}
		}
	}

	private static void swapData(int[] arr, int i) {
		int temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
	}

	static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}
