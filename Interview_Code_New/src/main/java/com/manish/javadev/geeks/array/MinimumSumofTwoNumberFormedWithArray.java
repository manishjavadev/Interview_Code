package com.manish.javadev.geeks.array;

import java.util.Arrays;

/**
 * Minimum sum of two numbers formed from digits of an array
 * 
 * Input: [6, 8, 4, 5, 2, 3] Output: 604 The minimum sum is formed by numbers
 * 358 and 246
 * 
 * Input: [5, 3, 0, 7, 4] Output: 82 The minimum sum is formed by numbers 35 and
 * 047
 * 
 * 1) A minimum number will be formed from set of digits when smallest digit
 * appears at most significant position and next smallest digit appears at next
 * most significant position ans so on..
 * 
 * 2) The idea is to sort the array in increasing order and build two numbers by
 * alternating picking digits from the array. So first number is formed by
 * digits present in odd positions in the array and second number is formed by
 * digits from even positions in the array. Finally, we return the sum of first
 * and second number.
 * 
 * The Class MinimumPossibleSumofTwoNumber.
 * 
 * @author Manish
 */
public class MinimumSumofTwoNumberFormedWithArray {

	static int[] arr = { 6, 8, 4, 5, 2, 3 };

	public static void main(String[] args) {
		MinimumSumofTwoNumberFormedWithArray mpstn = new MinimumSumofTwoNumberFormedWithArray();
		int result = mpstn.getMinimumSumOfTwoNumber(arr);
		System.out.println(result);
	}

	private int getMinimumSumOfTwoNumber(int[] inputArray) {
		// Step1 Sort the array we are assuming that sorting you can do we just
		// puted in sorted order
		Arrays.sort(inputArray);
		int odd = 0;
		int even = 0;

		// Step2 find the sum of odd position in one variable and even position
		// in another variable and finally sum both the value will get the
		// result
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i % 2 == 0) {
				even = even * 10 + arr[i];
			} else {
				odd = odd * 10 + arr[i];
			}
		}

		return odd + even;
	}
}
