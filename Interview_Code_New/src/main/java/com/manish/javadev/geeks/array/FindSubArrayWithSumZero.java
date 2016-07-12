package com.manish.javadev.geeks.array;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* Find all subarray whose sum 0
 * 
 * Input:  arr = [6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7]
  Output:  
  Subarray found from Index 2 to 4
  Subarray found from Index 2 to 6          
  Subarray found from Index 5 to 6
  Subarray found from Index 6 to 9
  Subarray found from Index 0 to 10*/


/*A simple solution is to consider all subarrays one by one and check if sum of every 
 * subarray is equal to 0 or not. The complexity of this solution would be O(n^2).


A better approach is to use Hashing.

Do following for each element in the array

	1) Maintain sum of elements encountered so far in a variable (say sum).
	2) If current sum is 0, we found a subarray starting from index 0 and ending at index current index
	3) Check if current sum exists in the map  or not.
	4) If current sum exists in the map, that means we have subarray(s) present with 0 sum that ends at current index.
	5) Insert current sum into the map*/

/**
 * @author Manish
 *
 */
public class FindSubArrayWithSumZero {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		displaySubarray();
	}

	/**
	 * Display subarray.
	 */
	private static void displaySubarray() {
		int[] input = new int[] { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		LinkedHashMap<Integer, List<Integer>> map = new LinkedHashMap<Integer, List<Integer>>();

		int preSum = 0;

		// Loop across all elements of the array
		for (int i = 0; i < input.length; i++) {
			preSum += input[i];
			if (preSum == 0) {
				System.out.println("SUM 0 Start: " + (0) + "-" + i);
			}
			// If preSum is present, it means that
			// Sub array found
			if (map.containsKey(preSum)) {
				List<Integer> startIndices = map.get(preSum);
				for (int start : startIndices) {
					System.out.println("SUM 0 Start: " + (start + 1) + "-" + i);
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
}
