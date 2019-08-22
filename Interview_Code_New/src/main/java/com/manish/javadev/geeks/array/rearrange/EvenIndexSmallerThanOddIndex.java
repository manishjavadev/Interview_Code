package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

/**
 * Given an array, rearrange the array such that :
 * 
 * Rearrange array such that even index elements are smaller and odd index
 * elements are greater
 * 
 * If index i is even, arr[i] <= arr[i+1] If index i is odd, arr[i] >= arr[i+1]
 * 
 * Input : arr[] = {2, 3, 4, 5} Output : arr[] = {2, 4, 3, 5} Explanation :
 * Elements at even indexes are smaller and elements at odd indexes are greater
 * than their next elements
 * 
 * Note : Another valid answer is arr[] = {3, 4, 2, 5}
 * 
 * Input :arr[] = {6, 4, 2, 1, 8, 3} Output :arr[] = {4, 6, 1, 8, 2, 3}
 * 
 * An efficient solution is to iterate over the array and swap the elements as
 * per the given condition. If we have an array of length n, then we iterate
 * from index 0 to n-2 and check the given condition. At any point of time if i
 * is even and arr[i] > arr[i+1], then we swap arr[i] and arr[i+1]. Similarly,
 * if i is odd and arr[i] < arr[i+1], then we swap arr[i] and arr[i+1].
 * 
 * @author kmamani
 *
 */
public class EvenIndexSmallerThanOddIndex {
	public static void main(String[] args) {
		int arr[] = { 6, 4, 2, 1, 8, 3 };
		int n = arr.length;

		System.out.print("Before rearranging: \n");
		printArray(arr);

		rearrange(arr);

		System.out.print("After rearranging: \n");
		printArray(arr);
	}

	static void rearrange(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (i % 2 == 0 && arr[i] > arr[i + 1]) {
				swapData(arr, i);
			}
			if (i % 2 != 0 && arr[i] < arr[i + 1]) {
				swapData(arr, i);
			}
		}
	}

	private static void swapData(int[] arr, int i) {
		int temp;
		temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
	}

	/*
	 * Utility that prints out an array in a line
	 */
	static void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}

}
