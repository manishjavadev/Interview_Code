package com.manish.javadev.sorting;

import java.util.Arrays;

/**
 * @author Manish
 *
 */

/**
 * This java program sorting a number using insertion sort
 * 
 */
public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = { 7, 3, 6, 5, 3, 7, 9, 10 };
		int num, i, j;
		for (i = 1; i < arr.length; i++) {
			// Here I am taking first element from array and will compare
			// A previous element in array
			num = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > num; j--) {
				arr[j + 1] = arr[j];
			}
			// Here index is -1 for first run means i=1 so you add one in
			// index([index + 1]) and insert element Relate with other and
			// try to understand it.
			arr[j + 1] = num;
		}
		System.out.println("Sorted arrya is ");
		System.out.println(Arrays.toString(arr));
		System.out.println("\nDone");
	}
}
