package com.manish.javadev.sorting;

import java.util.Arrays;

/**
 * @author Manish
 *
 */

/**
 * 1. Take two array in sorted order for this program arr1, arr2 2. Take one
 * more array arr3 for merging two array 3. Take 3 indices for iterating for
 * loop, here index1, index2, index3 4. Here index1 and index2 for arr1 and arr2
 * and index3 for arr3 5. Then While loop
 */
public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 4, 6, 7, 9 };
		int arr2[] = { 10, 11, 12, 13, 17 };
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		int length = arr1.length + arr2.length;
		int arr3[] = new int[length];
		// Here we are iterating array and checking arr1 and arr2 value
		// for merging in third array arr3

		// Note: Suppose one array processed then other
		// array iterate again in while loop 2nd and 3rd while managing those logic
		while ((index1 < arr1.length) && (index2 < arr2.length)) {
			if (arr1[index1] < arr2[index2])
				arr3[index3++] = arr1[index1++];
			else
				arr3[index3++] = arr2[index2++];
		}
		while (index1 < arr1.length) {
			arr3[index3++] = arr1[index1++];
		}
		while (index2 < arr2.length) {
			arr3[index3++] = arr2[index2++];
		}
		System.out.println("After merging these two arrya is ");
		System.out.println(Arrays.toString(arr3));
		System.out.println("\nDone");
	}
}
