package com.manish.javadev.geeks.array.rotation;

import java.util.Arrays;

/*
 * Given an array, cyclically rotate the array clockwise by one. 
 * 
 * Input:  arr[] = {1, 2, 3, 4, 5}  Output: arr[] = {5, 1, 2, 3, 4}
 */
public class CyclicallyRotateAnArrayByOne {
	/* Driver program */
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Given Array is");
		System.out.println(Arrays.toString(arr));

		rotate(arr);

		System.out.println("Rotated Array is");
		System.out.println(Arrays.toString(arr));
	}

	// Method for rotation
	static void rotate(int arr[]) {
		int last = arr[arr.length - 1];
		int i = 0;
		for (i = arr.length - 1; i > 0; i--)
			arr[i] = arr[i - 1];
		arr[0] = last;
	}
}
