package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

public class ReorderArrayAccordingToGivenIdexes3 {

	public static void main(String[] args) {
		int arr[] = new int[] { 50, 40, 70, 60, 90 };
		int index[] = new int[] { 3, 0, 4, 1, 2 };
		reorder(arr, index);

		System.out.println("Reordered array is: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Modified Index array is:");
		System.out.println(Arrays.toString(index));
	}

	static void reorder(int[] arr, int[] index) {
		int temp[] = new int[arr.length];

		// arr[i] should be present at index[i] index
		for (int i = 0; i < arr.length; i++)
			temp[i] = arr[index[i]];

		// Copy temp[] to arr[]
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
			index[i] = i;
		}
	}
}
