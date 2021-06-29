package com.manish.javadev.leetcode.top.hundread;

public class MaximumSumSubarray {
	public static void main(String[] args) {
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = findMaxSum(arr);
		System.out.println("Result ::: " + result);
	}

	private static int findMaxSum(int[] arr) {
		int sum = 0;
		int max = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum > max) {
				max = sum;
				end = i;
			}
			if (sum < 0) {
				sum = 0;
				start = i + 1;
			}

		}
		System.out.println("Start index ::" + start + " end Index :: " + end);
		return max;
	}

}
