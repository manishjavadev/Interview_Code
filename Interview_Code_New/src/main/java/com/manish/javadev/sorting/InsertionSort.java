package com.manish.javadev.sorting;

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

		int arr[] = { 7, 3, 6, 5, 3, 7, 9, 10, };
		int num, i, index;
		for (i = 1; i < arr.length; i++) {
			//Here I am taking first element from array and will compare
			//A previous element in array
			num = arr[i];
			for (index = i-1; index >= 0&&arr[index] > num; index--) {
				arr[index + 1] = arr[index];
			}
			//Here index is -1 for first run means i=1 so you add one in 
			//index([index + 1]) and insert element Relate with other and 
			//try to understand it.
			arr[index + 1] = num;			
		}
		for (int arrNumber : arr) {
			System.out.print(arrNumber + "\t");
		}
		System.out.println("\nDone");
	}
}
