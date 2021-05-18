package com.manish.javadev.leetcode.top.hundread;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given nums = [2, 7, 11, 15], target = 9.
 * 
 * @author kmamani
 *
 */
public class TwoSum {
	public static void main(String[] args) {
		int arr[] = { 2, 7, 11, 15 };
		int target = 9;
		int[] calculatetwoSum = calculatetwoSum(arr, target);
		System.out.println(Arrays.toString(calculatetwoSum));

	}

	private static int[] calculatetwoSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(target - arr[1])) {
				return new int[] { map.get(target - arr[1]), i };
			} else {
				map.put(arr[i], i);
			}

		}
		return arr;
	}

}
