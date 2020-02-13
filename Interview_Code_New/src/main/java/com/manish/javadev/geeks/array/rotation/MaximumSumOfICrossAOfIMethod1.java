package com.manish.javadev.geeks.array.rotation;

/**
 * Find maximum value of Sum( i*arr[i]) with only rotations on given array
 * allowed
 * 
 * Given an array, only rotation operation is allowed on array. We can rotate
 * the array as many times as we want. Return the maximum possbile of summation
 * of i*arr[i]. Examples :
 * 
 * Input: arr[] = {1, 20, 2, 10} Output: 72 We can 72 by rotating array twice.
 * {2, 10, 1, 20} 20*3 + 1*2 + 10*1 + 2*0 = 72
 * 
 * Input: arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9}; Output: 330 We can 330 by
 * rotating array 9 times. {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 0*1 + 1*2 + 2*3 ...
 * 9*10 = 330
 * 
 * 
 * A Simple Solution is to find all rotations one by one, check sum of every
 * rotation and return the maximum sum. Time complexity of this solution is
 * O(n2).
 * 
 * @author kmamani
 *
 */
public class MaximumSumOfICrossAOfIMethod1 {
	// Driver code
	public static void main(String args[]) {
		int arr[] = { 8, 3, 1, 2 };
		int n = arr.length;
		System.out.println(maxSum(arr, n));
	}

	// Returns maximum value of i*arr[i]
	static int maxSum(int arr[], int n) {
		// Initialize result
		int max = arr[0];

		// Consider rotation beginning with i
		// for all possible values of i.
		for (int i = 0; i < n; i++) {
			// Initialize sum of current rotation
			int sum = 0;
			// Compute sum of all values. We don't
			// acutally rotation the array, but compute
			// sum by finding ndexes when arr[i] is
			// first element
			for (int j = 0; j < n; j++) {
				int index = (i + j) % n;
				sum += j * arr[index];
			}
			if (max < sum) {
				max = sum;
			}
		}
		return max;
	}
}
