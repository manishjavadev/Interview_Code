package com.manish.javadev.array;

import java.util.Arrays;

/**
 * Problem Statement Given an unsorted array of integer numbers, write a
 * function which returns the number that appears maximum times in the array.
 * 
 * Example: Let the array be 1, 2, 2, 3, 1, 3, 2. Mode of this array is 2.
 * 
 * Example: Let the array be 1, 2, 2, 3, 1, 3, 3, 2. Mode of this array is 2 if
 * two number have same occurrence the lower one is the answer.
 * 
 * Note: Above one number 2 and 3 frequency are same then lower one is 2 so 2 is
 * the answer
 * 
 * Keywords: Array mode, mode of the array, relative majority, plurality, array.
 * 
 * @author kmamani
 *
 */
public class FindModeInArray {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 3 };
		FindModeInArray findMode = new FindModeInArray();
		int result = findMode.findModeOfArray(a);
		System.out.println(result);
	}

	public int findModeOfArray(int[] arr) {

		if (arr == null || arr.length == 0)
			return 0;

		Arrays.sort(arr);

		int previous = arr[0];
		int mode = arr[0];
		int count = 1;
		int maxCount = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == previous)
				count++;
			else {
				if (count > maxCount) {
					mode = arr[i - 1];
					maxCount = count;
				}
				previous = arr[i];
				count = 1;
			}
		}

		return count > maxCount ? arr[arr.length - 1] : mode;
	}

}
