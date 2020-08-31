package com.manish.javadev.sorting;

import java.util.Arrays;

/**
 * 1. Take two array in sorted order for this program arr1, arr2 2. Take one
 * more array arr3 for merging two array 3. Take 3 indices for iterating for
 * loop, here index1, index2, index3 4. Here index1 and index2 for arr1 and arr2
 * and index3 for arr3 5. Then While loop
 * 
 * @author Manish Srivastava
 */
public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int a1[] = { 1, 3, 4, 6, 7, 9 };
		int a2[] = { 10, 11, 12, 13, 17 };
		int i = 0;
		int j = 0;
		int k = 0;
		int length = a1.length + a2.length;
		int a3[] = new int[length];
		// Here we are iterating array and checking arr1 and arr2 value
		// for merging in third array arr3

		// Note: Suppose one array processed then other
		// array iterate again in while loop 2nd and 3rd while managing those
		// logic
		while ((i < a1.length) && (j < a2.length)) {
			if (a1[i] < a2[j])
				a3[k++] = a1[i++];
			else
				a3[k++] = a2[j++];
		}
		while (i < a1.length) {
			a3[k++] = a1[i++];
		}
		while (j < a2.length) {
			a3[k++] = a2[j++];
		}
		System.out.println("After merging these two arrya is ");
		System.out.println(Arrays.toString(a3));
		System.out.println("\nDone");
	}
}
