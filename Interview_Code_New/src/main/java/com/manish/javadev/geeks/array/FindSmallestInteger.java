package com.manish.javadev.geeks.array;

/**
 * https://www.geeksforgeeks.org/find-smallest-value-represented-sum-subset-given-array/
 * 
 * Find the smallest positive integer value that cannot be represented as sum of
 * any subset of a given array Difficulty Level : Hard Last Updated : 06 May,
 * 2021 Given a sorted array (sorted in non-decreasing order) of positive
 * numbers, find the smallest positive integer value that cannot be represented
 * as sum of elements of any subset of given set. Expected time complexity is
 * O(n). Examples:
 * 
 * 
 * Input: arr[] = {1, 3, 6, 10, 11, 15}; Output: 2
 * 
 * Input: arr[] = {1, 1, 1, 1}; Output: 5
 * 
 * Input: arr[] = {1, 1, 3, 4}; Output: 10
 * 
 * Input: arr[] = {1, 2, 5, 10, 20, 40}; Output: 4
 * 
 * Input: arr[] = {1, 2, 3, 4, 5, 6}; Output: 22
 * 
 * @author kmamani
 *
 */
public class FindSmallestInteger {

	// Driver program to test above functions
	public static void main(String[] args) {
		FindSmallestInteger small = new FindSmallestInteger();
		int arr1[] = { 1, 3, 4, 5 };
		int n1 = arr1.length;
		System.out.println(small.findSmallest(arr1, n1));

		int arr2[] = { 1, 2, 6, 10, 11, 15 };
		int n2 = arr2.length;
		System.out.println(small.findSmallest(arr2, n2));

		int arr3[] = { 1, 1, 1, 1 };
		int n3 = arr3.length;
		System.out.println(small.findSmallest(arr3, n3));

		int arr4[] = { 1, 1, 3, 4 };
		int n4 = arr4.length;
		System.out.println(small.findSmallest(arr4, n4));

		int arr5[] = { 1, 2, 5 };
		int n5 = arr5.length;
		System.out.println(small.findSmallest(arr5, n5));

	}

	// Returns the smallest number that cannot be represented as sum
	// of subset of elements from set represented by sorted array arr[0..n-1]
	int findSmallest(int arr[], int n) {
		int res = 1; // Initialize result

		// Traverse the array and increment 'res' if arr[i] is
		// smaller than or equal to 'res'.
		for (int i = 0; i < n && arr[i] <= res; i++) {
			res = res + arr[i];
			System.out.println("arr " + arr[i]);
		}

		return res;
	}

}
