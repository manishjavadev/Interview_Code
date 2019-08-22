package com.manish.javadev.sorting;

import java.util.Arrays;

/**
 * @author Manish Srivastava
 *
 */
public class CreateMaxHeapFromArray {
	static int[] arr = { 10, 20, 30, 40, 50 };

	public static void main(String[] args) {

		for (int i = 0; i < arr.length; i++) {
			build_Max_Heap(arr[i], i);
		}
		display(arr);
	}

	private static void display(int[] arr2) {
		System.out.println(Arrays.toString(arr));
	}

	private static void build_Max_Heap(int num, int location) {
		int parent = 0;
		while (location > 0) {
			// Find parent for the current location
			parent = (location - 1) / 2;
			// Here need to check parent is greater than number
			// if yes: arr[location] replace with number
			if (num <= arr[parent]) {
				arr[location] = num;
				return;
			}
			arr[location] = arr[parent];
			// After each swap location should refer corresponding parent
			location = parent;
		}
		arr[0] = num;
	}

}
