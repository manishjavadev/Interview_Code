package com.manish.javadev.geeks.array;

/**
 * https://www.geeksforgeeks.org/duplicates-array-using-o1-extra-space-set-2/
 * 
 * @author kmamani
 *
 */
public class DuplicatesInArrayInONComplexityAndByUsingO1 {
	// Driver's code
	public static void main(String args[]) {
		int arr[] = { 1, 6, 3, 1, 3, 6, 6 };
		int arr_size = arr.length;

		System.out.println("The repeating elements are: ");
		printRepeating(arr, arr_size);
	}

	// function to find repeating elements
	static void printRepeating(int arr[], int n) {
		// First check all the values that are
		// present in an array then go to that
		// values as indexes and increment by
		// the size of array
		for (int i = 0; i < arr.length; i++) {
			int index = arr[i] % arr.length;
			arr[index] += arr.length;
		}

		// Now check which value exists more
		// than once by dividing with the size
		// of array
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] / n) > 1)
				System.out.println(i + " ");
		}
	}
}
