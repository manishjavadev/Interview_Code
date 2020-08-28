package com.manish.javadev.sorting;

import java.util.*;

/**
 * This program sorting the array
 * 
 * @author Manish Srivastava
 * 
 */
public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 1, 2, 6 };
		int i, j, temp;
		// Comparing first element with 2nd to end for i=0
		// 2nd element to 3rd to end for i=1 etc
		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted arrya is ");
		System.out.println(Arrays.toString(arr));
		System.out.println("\nDone");
	}
}
