package com.manish.javadev.geeks.array.rotation;

/**
 * https://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/
 * 
 * 
 * @author kmamani
 *
 */
public class FindMaximumValueofSum2 {

	// Driver method to test the above function
	public static void main(String[] args) {
		System.out.println("Max sum is " + maxSum());
	}

	static int arr[] = {1, 20, 2, 10}; 

	// Returns max possible value of i*arr[i]
	static int maxSum() {
		int arrSum = 0; // Stores sum of arr[i]
		int resultValue = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum = 0;
			for (int j = 0; j < arr.length; j++) {
				int index = (i + j) % arr.length;
				arrSum += j * arr[index];
			}

			resultValue = Math.max(resultValue, arrSum);
		}
		// Return result
		return resultValue;
	}

}
