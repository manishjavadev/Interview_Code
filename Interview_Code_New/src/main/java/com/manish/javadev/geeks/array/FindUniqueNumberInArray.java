package com.manish.javadev.geeks.array;

/**
 * Find Unique number in array
 * 
 * @author kmamani
 *
 */
public class FindUniqueNumberInArray {

	public static void main(String[] args) {
		int result[] = new int[256];
		int arr[] = { 11, 13, 14, 14, 17, 17, 117, 280, 5020, 5020 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 256) {
				result[(char) arr[i]]++;
			} else {
				result[(char) arr[i] / 256]++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 256) {
				if (result[(char) arr[i]] == 1) {
					System.out.println(arr[i]);
				}
			} else {
				if (result[(char) arr[i] / 256] == 1) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
