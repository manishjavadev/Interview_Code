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
public class ReverseTheElementOfArray {
	static int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

	public static void main(String[] args) {
		ReverseTheElementOfArray rea = new ReverseTheElementOfArray();
		int[] reverseArray = rea.reverseArray(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(reverseArray));
		System.out.println("\nDone");
	}

	private int[] reverseArray(int[] arr, int low, int high) {
		if (low < high) {
			swapData(arr, low, high);
			reverseArray(arr, low + 1, high - 1);
		}
		return arr;
	}

	private void swapData(int[] arr, int low, int high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}
}
