package com.manish.javadev.geeks.array;

/**
 * 
 * https://www.geeksforgeeks.org/find-all-missing-numbers-from-a-given-sorted-array/
 * 
 * @author m.d.srivastava
 * 
 */
public class FindAllMissingNumber {

	public static void main(String[] args) {
		int arr[] = { 6, 7, 10, 11, 13 };
		int len = arr.length;
		printMissingElements(arr, len);
	}

	static void printMissingElements(int arr[], int len) {
		/**
		 * Length of boolean array max element of arr +1
		 */
		boolean[] decider = new boolean[arr[len - 1] + 1];
		for (int i = 0; i < len; i++) {
			decider[arr[i]] = true;
		}
		/**
		 * 2nd for loop started from first element of arr, ended with last element of
		 * arr
		 */
		for (int i = arr[0]; i <= arr[len - 1]; i++) {
			if (decider[i] == false) {
				System.out.print(i + " ");
			}
		}
	}

}
