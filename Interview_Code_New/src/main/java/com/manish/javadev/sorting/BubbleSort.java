package com.manish.javadev.sorting;

/**
 * @author Manish
 *
 */

/**
 * This java program sorting a number using insertion sort
 * 
 */
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 7, 3, 6, 5, 3, 9, 10 };
		int i, j, temp;
		// Comparing first element with 2nd to end for i=0
		// 2nd element to 3rd to end for i=1 etc
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted arrya is ");
		// Using for each loop
		for (int arrNumber : arr) {
			System.out.print(arrNumber + "\t");
		}
		System.out.println("\nDone");
	}
}
