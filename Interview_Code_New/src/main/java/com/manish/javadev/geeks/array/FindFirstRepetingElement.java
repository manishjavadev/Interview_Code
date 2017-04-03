package com.manish.javadev.geeks.array;

import java.util.HashSet;

public class FindFirstRepetingElement {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 4, 3, 5, 3, 3, 6 };
		printFirstRepeating(arr);
		System.out.println("Done");
	}

	static void printFirstRepeating(int arr[]) {
		// Initialize index of first repeating element
		int firstRepeatingIndex = -1;

		// Creates an empty hashset
		HashSet<Integer> set = new HashSet<Integer>();

		// Traverse the input array from right to left
		for (int i = arr.length - 1; i >= 0; i--) {
			// If element is already in hash set, update min
			if (set.contains(arr[i]))
				firstRepeatingIndex = i;

			else
				// Else add element to hash set
				set.add(arr[i]);
		}

		// Print the result
		if (firstRepeatingIndex > 0)
			System.out.println("The first repeating element is " + arr[firstRepeatingIndex]);
		else
			System.out.println("There are no repeating elements");
	}

}
