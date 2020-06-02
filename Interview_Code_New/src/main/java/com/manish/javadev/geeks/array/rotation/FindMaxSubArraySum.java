package com.manish.javadev.geeks.array.rotation;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/longest-sub-array-sum-k/
 * 
 * Naive Approach: Consider the sum of all the sub-arrays and return the length
 * of the longest sub-array having sum �k�. Time Complexity is of O(n^2).
 * 
 * Efficient Approach: Following are the steps:
 * 
 * Initialize sum = 0 and maxLen = 0. Create a hash table having (sum, index)
 * tuples. For i = 0 to n-1, perform the following steps:
 * 
 * Accumulate arr[i] to sum.
 * 
 * If sum == k, update maxLen = i+1.
 * 
 * Check whether sum is present in the hash table or not.
 * 
 * If not present, then add it to the hash table as (sum, i) pair.
 * 
 * Check if (sum-k) is present in the hash table or not. If present, then obtain
 * index of (sum-k) from the hash table as index. Now check if maxLen <
 * (i-index), then update maxLen = (i-index). Return maxLen.
 * 
 * Longest sub-array having sum k =============================== Given an array
 * arr[] of size n containing integers. The problem is to find the length of the
 * longest sub-array having sum equal to the given value k.
 * 
 * Examples:
 * 
 * Input : arr[] = { 10, 5, 2, 7, 1, 9 }, k = 15 Output : 4 The sub-array is {5,
 * 2, 7, 1}.
 * 
 * Input : arr[] = {-5, 8, -14, 2, 4, 12}, k = -5 Output : 5
 * 
 * @author kmamani
 *
 */
public class FindMaxSubArraySum {
	// Find maximum length sub-array with sum S present in the given array
	public static void maxLengthSubArray(int[] arr, int keySum) {
		// create an empty Hash Map to store ending index of first
		// sub-array having some sum
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		// insert (0, -1) pair into the set to handle the case when
		// sub-array with sum S starts from index 0
		map.put(0, -1);

		int sum = 0;

		// len stores the maximum length of sub-array with sum S
		int len = 0;

		// stores ending index of maximum length sub-array having sum S
		int ending_index = -1;

		// traverse the given array
		for (int i = 0; i < arr.length; i++) {
			// sum of elements so far
			sum += arr[i];

			// when subarray starts from index '0'
			if (sum == keySum)
				ending_index = i + 1;

			// if sum is seen for first time, insert sum with its index
			// into the map
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			}
			// update length and ending index of maximum length sub-array
			// having sum S
			if (map.containsKey(sum - keySum) && len < i - map.get(sum - keySum)) {
				len = i - map.get(sum - keySum);
				ending_index = i;
			}
		}

		// print the sub-array
		System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");
	}

	// main function
	public static void main(String[] args) {
		int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int sum = 17;

		maxLengthSubArray(A, sum);
	}
}
