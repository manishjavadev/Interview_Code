package com.manish.javadev.geeks.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author m.d.srivastava
 * 
 */
public class RemoveDuplicatePrimeWithMergeSort {
	static int arr[] = { 3, 2, 5, 7, 13, 11, 5, 13, 29, 13 };
	static int temp[] = new int[arr.length];

	public static void main(String[] args) {

		doMergeSort(0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		List list= Arrays.asList(arr);
		

	}

	private static void doMergeSort(int low, int high) {

		if (low != high) {
			int mid = (low + high) / 2;
			doMergeSort(low, mid);
			doMergeSort(mid + 1, high);
			arr = ArrayHelper.mergePartOfArray(arr, temp, low, mid, high);
		}

	}

	private static void removeDups(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}
}