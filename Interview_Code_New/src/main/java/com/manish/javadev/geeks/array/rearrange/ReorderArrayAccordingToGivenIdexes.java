package com.manish.javadev.geeks.array.rearrange;

import java.util.Arrays;

/**
 * https://www.tutorialcup.com/array/reorder-array-according-indexes.htm
 * 
 * Till the end of the array, pick each element while index[i] is not equal to i
 * a. swap the elements at arr[i] and arr[index[i]] b. swap the indexes at
 * index[i], index[index[i]]
 * 
 * Input : arr[] = [23,24,25] and given indexes are index[] = [1,0,2]
 * 
 * 23 should be moved to Index 1. 24 should be moved to Index 0 and 25 should be
 * at Index 2.
 * 
 * Output : arr[] = [24,23,25]
 * 
 * In the above example, the output array will have 23 in index 1, 24 in index 0
 * and 25 in index 2.
 * 
 * Time Complexity:O(n) Auxiliary space: O(1)
 * 
 * @author kmamani
 *
 */







public class ReorderArrayAccordingToGivenIdexes {

	public static void main(String[] args) {
		int arr[] = new int[] { 50, 40, 70, 60, 90 };
		int index[] = new int[] { 3, 0, 4, 1, 2 };
		System.out.println("Before recording Array" + Arrays.toString(arr));
		reorder(arr, index);
		int compareTo = "23".compareTo("24");
		if (compareTo < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Positive");
		}

		System.out.println("Reordered array is: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Modified Index array is:");
		System.out.println(Arrays.toString(index));
	}

	static void reorder(int[] arr, int[] index) {
		int temp[] = new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			while (index[i] != i) {
				swap(arr, i, index[i]); // swap both the elements
				swap(index, i, index[i]); // swap both the indices
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
