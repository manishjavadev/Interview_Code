package com.manish.javadev.geeks.array;

import java.util.HashSet;

public class FindFirstRepetingElement {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 3, 4, 3, 5, 3, 3, 6 };
		int result = printFirstRepeating(arr);
		if (result >= 0)
			System.out.println("The first repeating element is " + arr[result]);
		else
			System.out.println("There are no repeating elements");
		System.out.println("Done");
	}

	static int printFirstRepeating(int arr[]) {
		// Initialize index of first repeating element
		int firstRepeatingIndex = -1;

		// Creates an empty hashset
		HashSet<Integer> set = new HashSet<Integer>();

		// Traverse the input array from right to left
		for (int i = arr.length - 1; i >= 0; i--) {
			// If element is already in hash set, update min
			if (set.contains(arr[i]))
				firstRepeatingIndex = i;
			else {
				// Else add element to hash set
				set.add(arr[i]);
			}
		}

		return firstRepeatingIndex;
	}

}
