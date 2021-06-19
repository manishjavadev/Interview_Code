package com.manish.javadev.leetcode.top.hundread;

import java.util.ArrayList;
import java.util.List;

public class FindSingleNumber {
	public static void main(String[] args) {
		int arr[] = { 2, 2, 1 };
		int arr1[] = { 4, 1, 2, 1, 2 };
		int arr2[] = { 0 };

		FindSingleNumber findSingleNumber = new FindSingleNumber();
		int result = findSingleNumber.singleNumber(arr);
		System.out.println(result);
		result = findSingleNumber.singleNumber(arr1);
		System.out.println(result);
		result = findSingleNumber.singleNumber(arr2);
		System.out.println(result);

	}

	public int singleNumber(int[] nums) {
		List list = new ArrayList();
		for (int i = 0; i < nums.length; i++) {
			if (list.contains(nums[i])) {
				list.remove(nums[i]);

			} else {
				list.add(nums[i]);
			}
		}
		return (int) list.get(0);
	}
}
