package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

/**
 * Input : arr[] = {1, 2, 3, 4, 5, 6, 7} Output : 4 5 3 6 2 7 1
 * 
 * Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8} Output : 4 5 2 6 1 8 1 8
 * 
 * 
 * Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if
 * i is odd and j < i
 * 
 * ==================================
 * Given an array of n elements. Our task is to write a program to rearrange the
 * array such that elements at even positions are greater than all elements
 * before it and elements at odd positions are less than all elements before it.
 * ==================================
 * The idea to solve this problem is to first create an auxiliary copy of the
 * original array and sort the copied array. Now total number of even position
 * in array with n elements will be floor(n/2) and remaining is the number of
 * odd positions. Now fill the odd and even positions in the original array
 * using the sorted array in the below manner:
 * 
 * Total odd positions will be n – floor(n/2). Start from (n-floor(n/2))th
 * position in the sorted array and copy the element to 1st position of sorted
 * array. Start traversing the sorted array from this position towards left and
 * keep filling the odd positions in the original array towrds right. Start
 * traversing the sorted array starting from (n-floor(n/2)+1)th position towards
 * right and keep filling the original array starting from 2nd position.
 * 
 * @author kmamani
 *
 */
public class RearrangeArrayIfAiGreaterThanAj {

	// Driver function
	public static void main(String argc[]) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int len = arr.length;
		System.out.println("Array Length =" + len);
		rearrangeArr(arr, len);

	}

	// function to rearrange the array
	public static void rearrangeArr(int arr[], int len) {
		// total even positions
		int evenPos = len / 2;

		// total odd positions
		int oddPos = len - evenPos;

		// copy original array in an auxiliary array
		int[] tempArr = Arrays.copyOf(arr, arr.length);

		// sort the auxiliary array
		Arrays.sort(tempArr);

		int j = oddPos - 1;

		// fill up odd position in original array
		for (int i = 0; i < len; i += 2) {
			arr[i] = tempArr[j];
			j--;
		}

		j = oddPos;

		// fill up even positions in
		// original array
		for (int i = 1; i < len; i += 2) {
			arr[i] = tempArr[j];
			j++;
		}

		// display array
		for (int i = 0; i < len; i++)
			System.out.print(arr[i] + " ");
	}

}
