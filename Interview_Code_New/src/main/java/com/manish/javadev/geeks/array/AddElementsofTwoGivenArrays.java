package com.manish.javadev.geeks.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 
 Add elements of given arrays with given constraints
 Given two integer arrays, add their elements into third array by satisfying following constraints –

 1. Addition should be done starting from 0th index of both arrays.
 2. Split the sum if it is a not a single digit number and store the digits in adjacent locations in output array.
 3. Output array should accommodate any remaining digits of larger input array.

 Examples:

 Input: 
 a = [9, 2, 3, 7, 9, 6]
 b = [3, 1, 4, 7, 8, 7, 6, 9]
 Output: 
 [1, 2, 3, 7, 1, 4, 1, 7, 1, 3, 6, 9]

 Input:     
 a = [9343, 2, 3, 7, 9, 6]
 b = [34, 11, 4, 7, 8, 7, 6, 99]
 Output: 
 [9, 3, 7, 7, 1, 3, 7, 1, 4, 1, 7, 1, 3, 6, 9, 9]

 Input:     
 a = []
 b = [11, 2, 3 ]
 Output: 
 [1, 1, 2, 3 ]

 */

public class AddElementsofTwoGivenArrays {
	public static ArrayList<Integer> output = new ArrayList<Integer>();

	public static void main(String[] args) {
		int arr1[] = { 9, 2, 3, 7, 1, 5 };
		int arr2[] = { 3, 1, 8 };
		addArrays(arr1, arr2);
		System.out.println(output);
	}

	private static void addArrays(int[] arr1, int[] arr2) {
		int index1 = 0, index2 = 0;

		while ((index1 < arr1.length) && (index2 < arr2.length)) {
			int sum = arr1[index1++] + arr2[index2++];
			if (sum < 10) {
				output.add(sum);
			} else {
				split(sum);
			}
		}
		while (index1 < arr1.length) {
			int sum = arr1[index1++];
			if (sum < 10) {
				output.add(sum);
			} else {
				split(sum);
			}
		}

		// push remaining elements of second input array
		// (if any) to output vector
		while (index2 < arr2.length) {
			int sum = arr2[index2++];
			if (sum < 10) {
				output.add(sum);
			} else {
				split(sum);
			}
		}
	}

	private static void split(int sum) {
		List<Integer> reverseOut = new ArrayList<Integer>();
		while (sum > 0) {
			reverseOut.add(sum % 10);
			sum = sum / 10;
		}
		Collections.reverse(reverseOut);
		output.addAll(reverseOut);
	}
}
