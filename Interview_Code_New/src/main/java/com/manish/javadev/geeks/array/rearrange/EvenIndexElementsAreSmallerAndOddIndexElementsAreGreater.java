package com.manish.javadev.geeks.array.rearrange;

/**
 * https://www.geeksforgeeks.org/rearrange-array-even-index-elements-smaller-odd-index-elements-greater/
 * 
 * Given an array, rearrange the array such that :
 * 
 * If index i is even, arr[i] <= arr[i+1]
 * 
 * If index i is odd, arr[i] >= arr[i+1]
 * 
 * Input : arr[] = {2, 3, 4, 5} Output : arr[] = {2, 4, 3, 5} Explanation :
 * Elements at even indexes are smaller and elements at odd indexes are greater
 * than their next elements
 * 
 * Note : Another valid answer is arr[] = {3, 4, 2, 5}
 * 
 * Input :arr[] = {6, 4, 2, 1, 8, 3} Output :arr[] = {4, 6, 1, 8, 2, 3}
 * 
 * A simple solution is to sort the array in decreasing order, then starting
 * from second element, swap the adjacent elements.
 * 
 * An efficient solution is to iterate over the array and swap the elements as
 * per the given condition. If we have an array of length n, then we iterate
 * from index 0 to n-2 and check the given condition.
 * 
 * At any point of time if i is even and arr[i] > arr[i+1], then we swap arr[i]
 * and arr[i+1].
 * 
 * Similarly, if i is odd and arr[i] < arr[i+1], then we swap arr[i] and
 * arr[i+1].
 * 
 * For the given example: Before rearrange, arr[] = {2, 3, 4, 5} Start iterating
 * over the array till index 2 (as n = 4) Time Complexity :O(n)
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
