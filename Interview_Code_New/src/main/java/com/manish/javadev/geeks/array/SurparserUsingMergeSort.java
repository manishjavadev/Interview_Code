package com.manish.javadev.geeks.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://www.geeksforgeeks.org/find-surpasser-count-of-each-element-in-array/
 * 
 * Find Surpasser Count of each element in array A surpasser of an element of an
 * array is a greater element to its right, therefore x[j] is a surpasser of
 * x[i] if i < j and x[i] < x[j]. The surpasser count of an element is the
 * number of surpassers.
 * 
 * Given an array of distinct integers, for each element of the array find its
 * surpasser count i.e. count the number of elements to the right that are
 * greater than that element.
 * 
 * Examples:
 * 
 * Input: [2, 7, 5, 3, 0, 8, 1] Output: [4, 1, 1, 1, 2, 0, 0]
 * 
 * ================================================================
 * 
 * Method 2 (Uses Merge Sort) For any element of the array, we can easily find
 * out number of elements to the right that are greater than that element if we
 * know number of elements to its right that are less than that element. The
 * idea is to count the number of inversions for each element of the array using
 * merge sort. So, surpasser count of an element at position i will be equal to
 * “n – i – inversion-count” at that position where n is the size of the array.
 * 
 * We have already discussed how to find inversion count of complete array here.
 * We have modified the discussed approach to find number of inversions for each
 * element of the array instead of returning inversion count of whole array.
 * Also, as all elements of the array are distinct, we maintain a map that
 * stores inversion count for each element of the array.
 * 
 * Input: [2, 7, 5, 3, 0, 8, 1] Output: [4, 1, 1, 1, 2, 0, 0]
 * 
 * Input: [4, 6, 3, 9, 7, 10] Output: [4, 3, 3, 1, 1, 0]
 * 
 * @author m.d.srivastava
 * 
 */
public class SurparserUsingMergeSort {
	static int arr[] = { 4, 6, 3, 9, 7, 10 };
	static int arrRef[] = { 4, 6, 3, 9, 7, 10 };
	/*
	 * static int arr[] = { 2, 7, 5, 3, 0, 8, 1 }; static int arrRef[] = { 2, 7, 5,
	 * 3, 0, 8, 1 };
	 */

	int temp[] = new int[arr.length];
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		SurparserUsingMergeSort ms = new SurparserUsingMergeSort();
		ms.doSorting();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrRef));
		int len = arr.length - 1;
		for (int i = 0; i < arrRef.length; i++) {
			System.out.print((len - i) - (map.get(arrRef[i]) != null ? map.get(arrRef[i]) : 0) + "  ");
		}
	}

	private void doSorting() {
		int len = arr.length - 1;
		merge_sort(0, len);
	}

	private void merge_sort(int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			merge_sort(low, mid);
			merge_sort(mid + 1, high);
			mergePartOfArray(arr, low, mid, high);
		}
	}

	private void mergePartOfArray(int[] temArr, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		int inverCount = 0;

		while ((i <= mid) && (j <= high)) {
			if (temArr[i] >= temArr[j]) {
				temp[k++] = temArr[j++];
				inverCount++;
			} else {
				map.put(arr[i], map.getOrDefault(arr[i], 0) + inverCount);
				temp[k++] = temArr[i++];
			}
		}

		// copy remaining elements
		while (i <= mid) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + inverCount);
			temp[k++] = temArr[i++];
		}

		// copy second half
		while (j <= high) {
			temp[k++] = temArr[j++];
		}

		// copy back to the original array to reflect sorted order
		for (i = low; i <= high; i++) {
			temArr[i] = temp[i];
		}
	}
}