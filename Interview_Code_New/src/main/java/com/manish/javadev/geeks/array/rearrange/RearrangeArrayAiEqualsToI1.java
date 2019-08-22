package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

/**
 * Rearrange an array such that arr[i] = i
 * 
 * Given an array of elements of length N, ranging from 0 to N – 1. All elements
 * may not be present in the array. If element is not present then there will be
 * -1 present in the array. Rearrange the array such that A[i] = i and if i is
 * not present, display -1 at that place.
 * 
 * Examples:
 * 
 * Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1} Output : [-1, 1, 2, 3, 4,
 * -1, 6, -1, -1, 9]
 * 
 * Input : arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14,
 * 17, 4} Output : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
 * 17, 18, 19]
 * 
 * 
 * 1. Nav­i­gate the array.
 * 
 * 2. Check if a[i] = -1, if yes then ignore it.
 * 
 * 3. If a[i] != -1, Check if element a[i] is at its cor­rect posi­tion
 * (i=A[i]). If yes then ignore it. 4. If a[i] != -1 and ele­ment a[i] is not at
 * its cor­rect posi­tion (i!=A[i]) then place it to its correct posi­tion, but
 * there are two conditions:
 * 
 * Either A[i] is vacate, means A[i] = -1, then just put A[i] = i . OR A[i] is
 * not vacate, means A[i] = x, then int y=x put A[i] = i. Now, we need to place
 * y to its cor­rect place, so repeat from step 3.
 * 
 * 
 * @author kmamani
 *
 */
public class RearrangeArrayAiEqualsToI1 {

	// Driver function.
	public static void main(String[] args) {
		int arr[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		// int arr1[] = { 19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13,
		// 16, 2, 14, 17, 4 };
		System.out.println(Arrays.toString(fix(arr)));
	}

	// Function to rearrange an array
	// such that arr[i] = i.
	public static int[] fix(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != -1 && arr[i] != i) {
				int x = arr[i];

				// check if desired place
				// is not vacate
				while (arr[x] != -1 && arr[x] != x) {

					// store the value from
					// desired place
					int y = arr[x];

					// place the x to its correct
					// position
					arr[x] = x;

					// now y will become x, now
					// search the place for x
					x = y;
					System.out.println("Printing");
				}

				// place the x to its correct
				// position
				arr[x] = x;

				// check if while loop hasn't
				// set the correct value at A[i]
				if (arr[i] != i) {

					// if not then put -1 at
					// the vacated place
					arr[i] = -1;
				}
			}
		}
		return arr;
	}
}