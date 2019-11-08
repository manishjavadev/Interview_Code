package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

/**
 * Rearrange an array in order � smallest, largest, 2nd smallest, 2nd largest,
 * ..
 * 
 * Given an array of integers, task is to print the array in the order �
 * smallest number, Largest number, 2nd smallest number, 2nd largest number, 3rd
 * smallest number, 3rd largest number and so on�..
 * 
 * Examples:
 * 
 * Input : arr[] = [5, 8, 1, 4, 2, 9, 3, 7, 6] Output :arr[] = {1, 9, 2, 8, 3,
 * 7, 4, 6, 5}
 * 
 * Input : arr[] = [1, 2, 3, 4] Output :arr[] = {1, 4, 2, 3}
 * 
 * #############################################################
 * 
 * A simple solution is to first find the smallest element, swap it with first
 * element. Then find largest element, swap it with second element and so on.
 * Time complexity of this solution is O(n2).
 * 
 * An efficient solution is to use sorting. 1. Sort the elements of array. 2.
 * Take two variables say i and j and point them to the first and last index of
 * the array respectively. 3. Now run a loop and store the elements in the array
 * one by one by incrementing i and decrementing j.
 * 
 * Let�s take an array with input 5, 8, 1, 4, 2, 9, 3, 7, 6 and sort them so the
 * array become 1, 2, 3, 4, 5, 6, 7, 8, 9. Now take two variables say i and j
 * and point them to the first and last index of the array respectively, run a
 * loop and store value into new array by incrementing i and decrementing j. We
 * get final result as 1 9 2 8 3 7 4 6 5.
 * 
 * Time Complexity : O(n Log n) Auxiliary Space : O(n)
 * 
 * @author kmamani
 *
 */
public class ArrayInOrderSmallestAndLargest {
	public static void main(String args[]) {
		int arr[] = { 1, 3, 6, 2, 7 };
		int n = arr.length;
		rearrangeArray(arr, n);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	// Function which arrange the array.
	static void rearrangeArray(int arr[], int n) {
		// Sorting the array elements
		Arrays.sort(arr);

		int[] tmp = new int[n]; // To store modified array

		// Adding numbers from sorted array to
		// new array accordingly
		int k = 0;
		int p = 0;
		int l = tmp.length - 1;

		for (int i = 0; i < tmp.length; i++) {
			if (i % 2 == 0) {
				tmp[k++] = arr[p++];
			} else {
				tmp[k++] = arr[l--];
			}

		}

		// Modifying original array
		for (int i = 0; i < n; i++)
			arr[i] = tmp[i];
	}
}
