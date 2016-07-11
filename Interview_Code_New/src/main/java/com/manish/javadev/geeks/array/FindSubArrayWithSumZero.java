package com.manish.javadev.geeks.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSubArrayWithSumZero {

	public static void main(String[] args) {
		// subArraySumsZero();
		printSubarrays();
	}

	private static void printSubarrays() {
		int[] input = new int[] { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

		int preSum = 0;

		// Loop across all elements of the array
		for (int i = 0; i < input.length; i++) {
			preSum += input[i];
			if (preSum == 0) {
				System.out.println("Start: " + 0 + "\tEnd: " + i);
			}
			// If point where sum = (preSum - k) is present, it means that
			// between that
			// point and this, the sum has to equal k
			if (map.containsKey(preSum)) { // Subarray found
				List<Integer> startIndices = map.get(preSum);
				for (int start : startIndices) {
					System.out.println("Start: " + (start + 1) + "\tEnd: " + i);
				}
			}

			List<Integer> newStart = new ArrayList<Integer>();
			if (map.containsKey(preSum)) {
				newStart = map.get(preSum);
			}
			newStart.add(i);
			map.put(preSum, newStart);
		}
	}

	private static void subArraySumsZero() {
		int[] seed = new int[] { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		int currSum = 0;
		HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < seed.length; i++) {
			currSum += seed[i];
			if (currSum == 0) {
				System.out.println("subset : { 0 - " + i + " }");
			} else if (sumMap.get(currSum) != null) {
				System.out.println("subset : { " + (sumMap.get(currSum) + 1)
						+ " - " + i + " }");
				sumMap.put(currSum, i);
			} else
				sumMap.put(currSum, i);
		}
		System.out.println("HASH MAP HAS: " + sumMap);
	}
}
