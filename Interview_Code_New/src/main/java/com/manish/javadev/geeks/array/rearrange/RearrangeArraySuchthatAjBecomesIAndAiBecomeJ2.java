package com.manish.javadev.geeks.array.rearrange;

/**
 * Given an array of size n where all elements are distinct and in range from 0
 * to n-1, change contents of arr[] so that arr[i] = j is changed to arr[j] = i.
 * 
 * 
 * Example 1: Input: arr[] = {1, 3, 0, 2};
 * 
 * Output: arr[] = {2, 0, 3, 1}; Explanation for the above output.
 * 
 * Since arr[0] is 1, arr[1] is changed to 0
 * 
 * Since arr[1] is 3, arr[3] is changed to 1
 * 
 * Since arr[2] is 0, arr[0] is changed to 2
 * 
 * Since arr[3] is 2, arr[2] is changed to 3
 * 
 * Example 2: Input: arr[] = {2, 0, 1, 4, 5, 3}; Output: arr[] = {1, 2, 0, 5, 3,
 * 4};
 * 
 * @author kmamani
 *
 */
public class RearrangeArraySuchthatAjBecomesIAndAiBecomeJ2 {

	public static void main(String[] args) {
		RearrangeArraySuchthatAjBecomesIAndAiBecomeJ2 arrange = new RearrangeArraySuchthatAjBecomesIAndAiBecomeJ2();
		int arr[] = { 2, 0, 1, 4, 5, 3 };
		int n = arr.length;

		System.out.println("Given array is ");
		arrange.printArray(arr, n);

		arrange.rearrange(arr, n);

		System.out.println("Modified array is ");
		arrange.printArray(arr, n);
	}

	void printArray(int arr[], int n) {
		int i;
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	// A utility function to rearrange elements in the cycle
	// starting at arr[i]. This function assumes values in
	// arr[] be from 1 to n. It changes arr[j-1] to i+1
	// if arr[i-1] is j+1
	void rearrangeUtil(int arr[], int n, int i) {
		// 'val' is the value to be stored at 'arr[i]'

		// The next value is determined using current index
		int val = -(i + 1);

		// The next index is determined
		// using current value
		i = arr[i] - 1;

		// While all elements in cycle are not processed
		while (arr[i] > 0) {
			// Store value at index as it is going to be
			// used as next index
			int new_i = arr[i] - 1;

			// Update arr[]
			arr[i] = val;

			// Update value and index for next iteration
			val = -(i + 1);
			i = new_i;
		}
	}

	// A space efficient method to rearrange 'arr[0..n-1]'
	// so that 'arr[j]' becomes 'i' if 'arr[i]' is 'j'
	void rearrange(int arr[], int n) {
		// Increment all values by 1, so that all elements
		// can be made negative to mark them as visited
		int i;
		for (i = 0; i < n; i++)
			arr[i]++;

		// Process all cycles
		for (i = 0; i < n; i++) {
			// Process cycle starting at arr[i] if this cycle is
			// not already processed
			if (arr[i] > 0)
				rearrangeUtil(arr, n, i);
		}

		// Change sign and values of arr[] to get the original
		// values back, i.e., values in range from 0 to n-1
		for (i = 0; i < n; i++)
			arr[i] = (-arr[i]) - 1;
	}
}
