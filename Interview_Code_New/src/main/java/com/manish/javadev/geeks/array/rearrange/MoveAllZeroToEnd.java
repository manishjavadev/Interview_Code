package com.manish.javadev.geeks.array.rearrange;

/**
 * Given an array of random numbers, Push all the zero’s of a given array to the
 * end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2,
 * 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The
 * order of all other elements should be same. Expected time complexity is O(n)
 * and extra space is O(1).
 * 
 * Input : arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
 * 
 * Output : arr[] = {1, 2, 4, 3, 5, 0, 0};
 * 
 * Input : arr[] = {1, 2, 0, 0, 0, 3, 6};
 * 
 * Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
 * 
 * 
 * There can be many ways to solve this problem. Following is a simple and
 * interesting way to solve this problem. Traverse the given array ‘arr’ from
 * left to right. While traversing, maintain count of non-zero elements in
 * array. Let the count be ‘count’. For every non-zero element arr[i], put the
 * element at ‘arr[count]’ and increment ‘count’. After complete traversal, all
 * non-zero elements have already been shifted to front end and ‘count’ is set
 * as index of first 0. Now all we need to do is that run a loop which makes all
 * elements zero from ‘count’ till end of the array.
 * 
 * Below is the implementation of the above approach.
 * 
 * @author kmamani
 *
 */
public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };
		int n = arr.length;

		System.out.print("Original array: ");
		printArray(arr, n);

		pushZerosToEnd(arr);

		System.out.print("Modified array: ");
		printArray(arr, n);
	}

	// function which pushes all
	// zeros to end of an array.
	static void pushZerosToEnd(int arr[]) {
		// Count of non-zero elements
		int count = 0;

		// Traverse the array. If element
		// encountered is non-zero, then
		// replace the element at index
		// 'count' with this element
		for (int i = 0; i < arr.length; i++)
			if (arr[i] != 0)

				// here count is incremented
				arr[count++] = arr[i];

		// Now all non-zero elements
		// have been shifted to front and
		// 'count' is set as index of first 0.
		// Make all elements 0 from count to end.
		while (count < arr.length)
			arr[count++] = 0;
	}

	// function to print the array elements
	static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
