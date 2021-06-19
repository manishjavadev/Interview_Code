package com.manish.javadev.leetcode.top.hundread;

import java.util.Arrays;

public class MaxDifferenceInArray {

	int max_def = -1;

	public static void main(String[] args) {
		MaxDifferenceInArray mda = new MaxDifferenceInArray();
		int arr[] = { 1, 2, 3, 100 };
		int result = mda.maximumGap(arr);
		System.out.println("Result :: " + result);
	}

	public int maximumGap(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] - nums[i] > max_def) {
				max_def = nums[i + 1] - nums[i];

			}
		}
		return max_def == -1 ? 0 : max_def;
	}
}
