package com.manish.javadev.geeks.array;

import java.util.Arrays;
import java.util.HashMap;

/*
 For any element of the array, we can easily find out number of elements
 to the right that are greater than that element if we know number of elements to its right 
 that are less than that element. The idea is to count the number of inversions for each element of the array 
 using merge sort. So, surpasser count 
 of an element at position i will be equal to “n – i – inversion-count” 
 at that position where n is the size of the array.
 We have already discussed how to find inversion count of
 complete array here. We have modified the discussed approach to find 
 number of inversions for each element of the array instead of 
 returning inversion count of whole array. Also, as all elements of
 the array are distinct, we maintain a map that stores inversion count for each element of the array.*/

/**
 * @author m.d.srivastava
 * 
 */
public class SurparserUsingMergeSort {
	static int arr[] = { 1, 20, 6, 4, 5 };
	int temArr[] = { 1, 20, 6, 4, 5 };
	int temp[] = new int[arr.length];
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		SurparserUsingMergeSort ms = new SurparserUsingMergeSort();
		ms.doSorting();
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			int tempresult = ((arr.length - 1) - i);
			Integer mapdata = map.get(i);
			if (null == mapdata) {
				mapdata = 0;
			}

			System.out.print(tempresult - mapdata + "\t");
		}
	}

	private void doSorting() {
		int len = arr.length - 1;
		merge_sort(temArr, 0, len);
	}

	private void merge_sort(int[] temArr2, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			merge_sort(temArr, low, mid);
			merge_sort(temArr, mid + 1, high);
			mergePartOfArray(temArr, low, mid, high);
		}
	}

	private void mergePartOfArray(int[] temArr2, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		int c = 0;
		while ((i <= mid) && (j <= high)) {
			while ((i <= mid) && (j <= high)) {
				if (temArr2[i] <= temArr2[j]) {
					if (map.get(temArr2[i]) == null) {
						map.put(temArr2[i], 0);
					} else {
						map.put(temArr2[i], map.get(temArr2[i]) + c);
					}
					temp[k++] = temArr2[i++];
				} else {
					temp[k++] = temArr2[j++];
					c++;
				}
			}

		}
		while (i <= mid) {
			if (map.get(temArr2[i]) == null) {
				map.put(temArr2[i], 0);
			} else {
				map.put(temArr2[i], map.get(temArr2[i]) + c);
			}
			temp[k++] = temArr2[i++];
		}
		while (j <= high) {
			temp[k++] = temArr2[j++];
		}
		for (i = low; i <= high; i++) {
			temArr2[i] = temp[i];
		}
	}

}
