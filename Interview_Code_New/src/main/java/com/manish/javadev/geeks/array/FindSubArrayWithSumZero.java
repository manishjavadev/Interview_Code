package com.manish.javadev.geeks.array;

import java.util.HashMap;

public class FindSubArrayWithSumZero {

	public static void main(String[] args) {
		subArraySumsZero();
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
