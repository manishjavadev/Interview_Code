package com.manish.javadev.sorting;

import java.util.Arrays;

/**
 * This java program sorting a number using insertion sort
 * 
 * @author Manish Srivastava
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 4, 1, 5, 3 };
		int i, j, temp;
		// Comparing first element with 2nd to end for i=0
		// first element with 2nd to end-1 for i=1
		// first element with 3rd to end-2 for i=2
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted arrya is ");
		System.out.println(Arrays.toString(arr));
		System.out.println("\nDone");
	}
}
