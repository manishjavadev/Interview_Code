package com.manish.javadev.array;

import java.util.Arrays;

/**
 * @author Manish
 *
 */

/**
 * This program reversing the given array
 * 
 */
public class ReverseTheElementOfArrayUsingForLoop {
	static int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

	public static void main(String[] args) {
		ReverseTheElementOfArrayUsingForLoop rea = new ReverseTheElementOfArrayUsingForLoop();
		int[] reverseArray = rea.reverseArray(arr);
		System.out.println(Arrays.toString(reverseArray));
		System.out.println("\nDone");
	}

	private int[] reverseArray(int[] arr) {

		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			swapData(arr, i, j);

		}
		return arr;
	}

	private void swapData(int[] arr, int low, int high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}
}
