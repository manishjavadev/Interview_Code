package com.manish.javadev.geeks.array;

import java.util.Arrays;

/**
 * @author m.d.srivastava
 * 
 */
public class MergeTwoSortedArrayWithO1ExtraSpace {
	static int arr1[] = { 1, 5, 9, 10, 15, 20 };
	static int arr2[] = { 2, 3, 8, 13 };//10,13,15,20

	public static void main(String[] args) {
		MergeTwoSortedArrayWithO1ExtraSpace mtsa = new MergeTwoSortedArrayWithO1ExtraSpace();
		mtsa.merge(arr1, arr2, arr1.length - 1, arr2.length - 1);
		System.out.println("AfterSorting = " + Arrays.toString(arr1));
		System.out.println("AfterSorting = " + Arrays.toString(arr2));
	}

	void merge(int ar1[], int ar2[], int l1, int l2) {
		// Iterate through all elements of ar2[] starting from
		// the last element
		for (int i = l2; i >= 0; i--) {
			/*
			 * Find the smallest element greater than ar2[i]. Move all elements
			 * one position ahead till the smallest greater element is not found
			 */
			int j, last = ar1[l1];
			for (j = l1 - 1; ar2[i] < ar1[j] && j >= 0; j--)
				ar1[j + 1] = ar1[j];
			ar1[j + 1] = ar2[i];
			ar2[i] = last;

			// If there was a greater element
			if (j != l1 - 1) {
				ar1[j + 1] = ar2[i];
				ar2[i] = last;
			}
		}
	}
}
