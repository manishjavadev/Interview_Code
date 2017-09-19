package com.manish.javadev.array;

/**
 * @author Manish
 *
 */

/**
 * This program sorting string of array in acceding order
 * 
 */
public class SortStringOfArray {
	public static void main(String[] args) {
		String str[] = { "Manish", "Ashish", "Ravi", "Java", "Technology" };

		sortStringArray(str, 0, str.length - 1);

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println("\nDone");
	}

	private static void sortStringArray(String[] str, int low, int high) {
		if (low < high) {
			if ((str[low].compareTo(str[high]) > 0)) {
				String temp = str[low];
				str[low] = str[high];
				str[high] = temp;
			}
			sortStringArray(str, ++low, --high);
		}
	}
}
