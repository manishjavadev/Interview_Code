package com.manish.javadev.geeks.array.rearrange;

/**
 * Given an array of n positive integers and a number k. Find the minimum number
 * of swaps required to bring all the numbers less than or equal to k together.
 * 
 * Input: arr[] = {2, 1, 5, 6, 3}, k = 3 Output: 1
 * 
 * Explanation: To bring elements 2, 1, 3 together, swap element '5' with '3'
 * such that final array will be- arr[] = {2, 1, 3, 6, 5}
 * 
 * Input: arr[] = {2, 7, 9, 5, 8, 7, 4}, k = 5 Output: 2
 * 
 * ####################################################################### A
 * simple solution is to first count all elements less than or equals to k(say
 * �good�). Now traverse for every sub-array and swap those elements whose value
 * is greater than k. Time complexity of this approach is O(n2)
 * 
 * A simple approach is to use two pointer technique and sliding window.
 * 
 * Find count of all elements which are less than or equals to �k�. Let�s say
 * the count is �cnt� Using two pointer technique for window of length �cnt�,
 * each time keep track of how many elements in this range are greater than �k�.
 * Let�s say the total count is �bad�. Repeat step 2, for every window of length
 * �cnt� and take minimum of count �bad� among them. This will be the final
 * answer.
 * 
 * @author kmamani
 *
 */
public class MinimumSwapsRequiredToGetLessThanKNeedToLookAgain {

	// Driver code
	public static void main(String[] args) {
		
		int arr[] = {2, 1, 5, 6, 3};
		int n = arr.length;
		int k = 3;

		/**int arr[] = { 2, 7, 9, 5, 8, 7, 4 };
		int n = arr.length;
		int k = 5;
		*/
		System.out.print(minSwap(arr, n, k));

	}

	// Utility function to find minimum swaps
	// required to club all elements less than
	// or equals to k together
	static int minSwap(int arr[], int n, int pivot) {

		// Find count of elements which are
		// less than equals to k
		int j = -1;
		int count = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > pivot) {
				j++;
				ans++;
				swapData(arr, i, j);
			}
		}
		return ans;
	}

	private static void swapData(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
