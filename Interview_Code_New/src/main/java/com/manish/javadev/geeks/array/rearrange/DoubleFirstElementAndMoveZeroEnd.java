package com.manish.javadev.geeks.array.rearrange;

/**
 * https://www.geeksforgeeks.org/double-first-element-move-zero-end/
 * 
 * Given an array of integers of size n. Assume �0� as invalid number and all
 * other as valid number. Convert the array in such a way that if next valid
 * number is same as current number, double its value and replace the next
 * number with 0. After the modification, rearrange the array such that all 0�s
 * are shifted to the end.
 * 
 * Examples:
 * 
 * Input : arr[] = {2, 2, 0, 4, 0, 8} Output : 4 4 8 0 0 0
 * 
 * Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8} Output : 4 2 12 8 0 0 0 0 0 0
 * 
 * ##################### Approach: First modify the array as mentioned, i.e., if
 * next valid number is same as current number, double its value and replace the
 * next number with 0. Algorithm for Modification:
 * 
 * 1. if n == 1 2. return 3. for i = 0 to n-2 4. if (arr[i] != 0) && (arr[i] ==
 * arr[i+1]) 5. arr[i] = 2 * arr[i] 6. arr[i+1] = 0 7. i++
 * 
 * @author kmamani
 *
 */
public class DoubleFirstElementAndMoveZeroEnd {

	public static void main(String[] args) {
		int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };
		int n = arr.length;

		System.out.print("Original array: ");
		printArray(arr, n);

		modifyAndRearrangeArr(arr, n);

		System.out.print("Modified array: ");
		printArray(arr, n);
	}

	// function which pushes all
	// zeros to end of an array.
	static void pushZerosToEnd(int arr[], int n) {
		// Count of non-zero elements
		int count = 0;

		// Traverse the array. If element
		// encountered is non-zero, then
		// replace the element at index
		// 'count' with this element
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)

				// here count is incremented
				arr[count++] = arr[i];

		// Now all non-zero elements
		// have been shifted to front and
		// 'count' is set as index of first 0.
		// Make all elements 0 from count to end.
		while (count < n)
			arr[count++] = 0;
	}

	// function to rearrange the array
	// elements after modification
	static void modifyAndRearrangeArr(int arr[], int n) {
		// if 'arr[]' contains a single element
		// only
		if (n == 1)
			return;

		// traverse the array
		for (int i = 0; i < n - 1; i++) {

			// if true, perform the required modification
			if ((arr[i] != 0) && (arr[i] == arr[i + 1])) {

				// double current index value
				arr[i] = 2 * arr[i];

				// put 0 in the next index
				arr[i + 1] = 0;

				// increment by 1 so as to move two
				// indexes ahead during loop iteration
				i++;
			}
		}

		// push all the zeros at
		// the end of 'arr[]'
		pushZerosToEnd(arr, n);
	}

	// function to print the array elements
	static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
