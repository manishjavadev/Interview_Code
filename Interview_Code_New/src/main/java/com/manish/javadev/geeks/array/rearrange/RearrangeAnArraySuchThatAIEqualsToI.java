package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/rearrange-array-arri/
 * 
 * 1) Iterate through elements in array
 * 
 * 2) If arr[i] >= 0 && arr[i] != i,
 * 
 * put arr[i] at i ( swap arr[i] with arr[arr[i]])
 * 
 * Below is the implementation of above approach.
 * 
 * Time Complexity: O(n)
 * 
 * @author kmamani
 *
 */
public class RearrangeAnArraySuchThatAIEqualsToI {
	public static void main(String[] args) {
		int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		for (int i = 0; i < arr.length;) {
			if (arr[i] >= 0 && arr[i] != i) {
				int ele = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = ele;
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
