package com.manish.javadev.geeks.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author m.d.srivastava
 * 
 */
public class RemoveDuplicatePrimeWithOrderOfN {
	static int arr[] = { 3, 2, 5, 7, 13, 11, 5, 13, 29, 13 };
	static int temp[] = new int[arr.length];

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		List<Integer> list = removeDups(arr);
		System.out.println(list);

	}

	private static List<Integer> removeDups(int[] inputArray) {
		int temp = inputArray[0];
		List<Integer> list = new ArrayList<Integer>();
		list.add(temp);
		for (int i = 1; i < inputArray.length; i++) {
			if (temp != inputArray[i]) {
				list.add(inputArray[i]);
				temp = inputArray[i];
			}
		}
		return list;
	}
}