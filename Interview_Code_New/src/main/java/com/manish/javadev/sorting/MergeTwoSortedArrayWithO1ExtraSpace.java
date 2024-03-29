package com.manish.javadev.sorting;

import java.util.Arrays;

/**
 * YouTube link https://www.youtube.com/watch?v=NWMcj5QFW74
 * 
 * Merge 2 sorted array without using any extra space, assume that
 * 
 * arr1 = {1,3,7,9} arr2 = {2,4,6,8} arr1 and arr2 length may be same or
 * different resulting array see below
 * 
 * arr1 = {1, 2, 3, 4} arr2 = {6, 7, 8, 9}
 * 
 * Note: now you can observe that, largest element of arr1 is less than the
 * smallest element of arr2, so this is the way to want to merge with 2 sorted
 * array array
 * 
 * result array = {{1, 2, 3, 4}, {6, 7, 8, 9}}
 * 
 * 
 * EX:arr1[] = { 1, 5, 9, 10, 15, 20 } and arr2[] = { 2, 3, 8, 13 }
 * 
 * AfterSorting arr1 [1, 2, 3, 5, 8, 9] and arr2 [10, 13, 15, 20]
 * 
 * Algorithm:
 * 
 * Will use insertion sort technique to solve this problem, will take one by one
 * element from arr2 and will place in array one at proper position and last
 * element of arr1 will place in arr2 if required
 * 
 * @author m.d.srivastava
 * 
 */
public class MergeTwoSortedArrayWithO1ExtraSpace {
	// static int arr2[] = { 2,3,5,7};
	// static int arr1[] = { 1,2,3,4,6,8 };// 10,13,15,20

	// static int[] arr1 = {2,3,5,7}; //2, 3, 5, 8
	// static int[] arr2 = {1,2,3,4,6,8};//1, 2, 3, 4, 6, 7
	// o/p = 1,2,2,3,3,4,5,6,7,8

	static int arr2[] = { 2, 4, 6, 8 , 10 };
	static int arr1[] = { 1, 3, 5, 7, 9 };// 10,13,15,20

	public static void main(String[] args) {
		MergeTwoSortedArrayWithO1ExtraSpace mtsa = new MergeTwoSortedArrayWithO1ExtraSpace();
		mtsa.merge(arr1, arr2, arr1.length, arr2.length);
		System.out.println("AfterSorting = " + Arrays.toString(arr1));
		System.out.println("AfterSorting = " + Arrays.toString(arr2));
	}

	void merge(int ar1[], int ar2[], int l1, int l2) {
		/*
		 * Iterate through all elements of ar2[] starting from the last element
		 */
		for (int i = l2 - 1; i >= 0; i--) {
			/*
			 * Find the smallest element from arr1, which is greater than ar2[i]. Move all
			 * elements one position ahead off arr1 till the smallest element is not found
			 */
			int j, last = ar1[l1 - 1];
			for (j = l1 - 2; ar1[j] > ar2[i] && j >= 0; j--) {
				ar1[j + 1] = ar1[j];
			}
			/**
			 * j != l1 - 2:
			 * 
			 * This means at-least one element is there which is greater than current
			 * element
			 * 
			 * 2nd condition:
			 * 
			 * if 2nd last of a1[j] is smaller than current element(a2[i]), then need to
			 * perform below logic assume that for loop for j is not executed at all
			 * 
			 * assume your arr1 ={1, 3, 5, 7, 11} and your arr2 ={2, 4, 8}
			 */
			if (j != l1 - 2 || last > ar2[i]) {
				ar1[j + 1] = ar2[i];
				ar2[i] = last;
			}
		}
	}
}
