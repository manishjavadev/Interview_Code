package com.manish.javadev.geeks.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * https://www.techiedelight.com/surpasser-count-each-element-array/
 * 
 * @author m.d.srivastava
 * 
 */
public class SurparserUsingMergeSort2 {

	public static void main(String[] args) {
		int[] arr = { 4, 6, 3, 9, 7, 10 };

		// find surpasser count for array elements
		Map<Integer, Integer> surpasserCount = getSurpasserCount(arr);

		for (int value : arr) {
			System.out.print(surpasserCount.get(value) + " ");
		}
	}

	// Function to merge two sorted sub-arrays arr[low .. mid] and
	// arr[mid + 1 .. high]
	public static void merge(int[] arr, int[] aux, int low, int mid, int high, Map<Integer, Integer> map) {
		int k = low, i = low, j = mid + 1;
		int count = 0;

		// run till there are elements in the left and right runs
		while (i <= mid && j <= high) {
			if (arr[i] > arr[j]) {
				// update surpasser count of arr[i]
				map.put(arr[i], map.getOrDefault(arr[i], 0) + count);

				aux[k++] = arr[i++];
			} else {
				aux[k++] = arr[j++];
				count++;
			}
		}

		// copy remaining elements
		while (i <= mid) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + count);
			aux[k++] = arr[i++];
		}

		// don't need to copy second half

		// copy back to the original array to reflect sorted order
		while (low <= high) {
			arr[low] = aux[low];
			low++;
		}
	}

	// Function to sort array arr [low..high] in descending order
	public static void mergeSort(int[] arr, int[] aux, int low, int high, Map<Integer, Integer> count) {
		// base case: run size is equal to 1
		if (high == low) {
			return;
		}

		// find mid point
		int mid = (low + high) / 2;

		// recursively split runs into two halves until run size == 1,
		// then merge them and return back up the call chain

		mergeSort(arr, aux, low, mid, count);
		mergeSort(arr, aux, mid + 1, high, count);

		merge(arr, aux, low, mid, high, count);
	}

	// Function to find surpasser count for each element of an array
	public static Map<Integer, Integer> getSurpasserCount(int[] arr) {
		Map<Integer, Integer> count = new HashMap<>();

		// create two copies of original array
		int[] aux = Arrays.copyOf(arr, arr.length);
		int[] refArr = Arrays.copyOf(arr, arr.length);

		// sort the array arr[] in descending order using auxiliary array aux[]
		mergeSort(aux, refArr, 0, arr.length - 1, count);

		return count;
	}

}