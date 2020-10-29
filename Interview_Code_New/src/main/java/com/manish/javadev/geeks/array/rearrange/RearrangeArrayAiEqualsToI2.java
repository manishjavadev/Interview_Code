package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

public class RearrangeArrayAiEqualsToI2 {

	// Driver function.
	public static void main(String[] args) {
		//int[] arr = { -1, -1, 6, 1, 9, 3, 7, -1, 4, -1 };
		int[] arr =  {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
		for (int i = 0; i < arr.length;) {
			if (arr[i] >= 0 && arr[i] != i) {
				int tmp = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = tmp;
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
