package com.manish.javadev.geeks.array;

/**
 * https://www.geeksforgeeks.org/duplicates-array-using-o1-extra-space-set-2/
 * 
 * @author kmamani
 *
 */
public class DuplicatesInArrayWithONComplexityAndByUsingO1 {
	// Driver's code
	public static void main(String args[]) {
		int arr[] = { 1, 6, 3, 1, 3, 6, 6 };

		System.out.println("The repeating elements are: ");
		printRepeating(arr);
	}

	// function to find repeating elements
	static void printRepeating(int arr[]) {
		int len = arr.length;
		/**
		 * First check all the values that are present in an array, then go to that
		 * values as indexes and increment by the constant value may be 10 or 100
		 */
		for (int i = 0; i < len; i++) {
			int index = arr[i] % 10;
			arr[index] += 10;
		}

		/**
		 * Now check which value exists more than once by dividing constant value may be
		 * 10 or 100 as per above logic
		 */
		for (int i = 0; i < len; i++) {
			if ((arr[i] / 10) > 1)
				System.out.println(i + " ");
		}
	}
}
