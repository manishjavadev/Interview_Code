package com.manish.javadev.geeks.array;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/*int[] arr={6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 }

 6  =0,  9  =1,  8  =2,  5  =3,  9  =1,4,  7  =5,  9  =1,4,6,  13 =7,  19 =8,  7  =5,9,  0  10


 6	9	8	5	9		7	9		13	19	 7  	0
 =======================================================
 0	1	2	3	1,4 	5	1,4,6	7	8	5,9		10
 */

/* Find all sub-array whose sum 0
 * 
 * Input:  arr = [6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7]
 Output:  
 Sub array found from Index 2 to 4
 Sub array found from Index 2 to 6          
 Sub array found from Index 5 to 6
 Sub array found from Index 6 to 9
 Sub array found from Index 0 to 10*/

/*A simple solution is to consider all sub-arrays one by one and check if sum of every 
 * sub-array is equal to 0 or not. The complexity of this solution would be O(n^2).


 A better approach is to use Hashing.

 Do following for each element in the array

 1) Maintain sum of elements encountered so far in a variable (say sum).
 2) If current sum is 0, we found a sub-array starting from index 0 and ending at index current index
 3) Check if current sum exists in the map  or not.
 4) If current sum exists in the map, that means we have sub-array(s) present with 0 sum that ends at current index.
 means in between current index sum where sum became 0 and again reached to stored element to map
 example:
 9(first key)  ---some other element stores-- 9(second key)
 9(first key)  ---  0  -- 9(second key)(current index at this place now)

 5) Insert current sum into the map*/

/**
 * @author m.d.srivastava
 *
 */
public class FindSubArrayWithSumZero {

	public static void main(String[] args) {
		displaySubarray();
	}

	private static void displaySubarray() {
		int[] input = new int[] { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		LinkedHashMap<Integer, List<Integer>> map = new LinkedHashMap<Integer, List<Integer>>();
		List<Integer> newStart = null;
		int preSum = 0;

		// Loop across all elements of the array
		for (int i = 0; i < input.length; i++) {
			preSum += input[i];
			if (preSum == 0) {
				System.out.println("SUM 0 Start: " + 0 + "-" + i);
			}
			// If preSum is present, it means that
			// Sub array found
			if (map.containsKey(preSum)) {
				newStart = map.get(preSum);
				for (int start : newStart) {
					System.out.println("SUM 0 Start: " + (start + 1) + "-" + i);
				}
			} else {
				newStart = new ArrayList<Integer>();
			}
			newStart.add(i);
			map.put(preSum, newStart);
		}
	}
}
