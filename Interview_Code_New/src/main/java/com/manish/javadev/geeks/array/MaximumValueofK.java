package com.manish.javadev.geeks.array;

import java.util.HashSet;
import java.util.Set;

public class MaximumValueofK {
	static Set set = new HashSet();

	public static void main(String[] args) {

		Integer[] array = { 4, 3, 1, 2 };
		int maximumNumber = findMaximumNum(array, array.length);
		System.out.println("Number is " + maximumNumber);
		System.out.println(set);
	}

	static int findMaximumNum(Integer[] array, int n) {
		// output can contain any number from n to 0
		// where n is length of the array

		// We start a loop from n as we need to find
		// maximum possible value
		for (int i = n; i >= 1; i--) {
			// count contains total number of elements
			// in input array that are more than equal to i
			int count = 0;
			int dataValue;
			set = new HashSet();
			int j = 0;
			System.out.println("\n");
			// traverse the input array and find count
			for (j = 0; j < array.length; j++) {
				if (i <= array[j]) {
					count++;
					set.add(array[j]);
					System.out.print(array[j] + "\t");
				}
			}
			if (count >= i) {
				return i;
			}

		}
		return 1;
	}
}
