package com.manish.javadev.geeks.array;

/**
 * Find arr2 is a sub array of arr1
 * 
 * 
 * Time Complexity: O(N) Auxiliary Space: O(1)
 * https://www.geeksforgeeks.org/check-whether-an-array-is-subarray-of-another-array/
 * 
 * @author kmamani
 *
 */
public class ArrayisSubarrayofAnotherArray {
	public static void main(String[] args) {
		int arr1[] = { 2, 3, 0, 5, 1, 1, 2 };
		int arr2[] = { 3, 0, 5, 1 };
		if (isSubArray(arr1, arr2))
			System.out.println("YES\n");
		else
			System.out.println("NO\n");
	}

	private static boolean isSubArray(int[] arr1, int[] arr2) {
		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] != arr2[j]) {
				i++;
				j++;
				if (j == arr2.length) {
					return true;
				}
			} else {
				i++;
				j = 0;
			}
		}
		return false;
	}
}
