package com.manish.javadev.geeks.array;

/**
 * Find Unique number in array
 * 
 * @author kmamani
 *
 */
public class FindNonRepeatingNumberInArray2 {

	public static void main(String[] args) {
		int result[] = new int[256];
		int arr[] = { 4, 1, 2, 1, 2 };
		System.out.println("Done");
		for (int i = 0; i < arr.length; i++) {
			result[(char) arr[i]]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (result[(char) arr[i]] == 1) {
				System.out.println(arr[i]);
			}
		}
	}
}
