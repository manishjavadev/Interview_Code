package com.manish.javadev.geeks.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author m.d.srivastava
 * 
 */
public class RemoveDuplicatePrimeWithMergeSort {
	static int arr[] = { 3, 2, 5, 7, 13, 11, 5, 13, 29, 13 };
	static int temp[] = new int[arr.length];

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		List<Integer> list = removeDups(arr);
		System.out.println(list);

	}

	private static List<Integer> removeDups(int[] inputArray) {
		int counter = 0;
		int temp = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			if (counter == 0) {
				temp = inputArray[i];
			}
			if (temp == inputArray[i]) {
				counter++;
			} else {
				list.add(temp);
				counter = 1;
				temp = inputArray[i];
			}
			if (i == inputArray.length - 1) {
				list.add(temp);
			}
		}
		return list;
	}

	private static void doMergeSort(int low, int high) {

		if (low != high) {
			int mid = (low + high) / 2;
			doMergeSort(low, mid);
			doMergeSort(mid + 1, high);
			arr = ArrayHelper.mergePartOfArray(arr, temp, low, mid, high);
		}

	}

}