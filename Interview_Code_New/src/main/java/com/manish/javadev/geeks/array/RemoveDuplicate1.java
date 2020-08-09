package com.manish.javadev.geeks.array;

import java.util.Arrays;

/**
 * 
 * Remove all consecutive duplicates from the string
 * 
 * Given a string S, remove all the consecutive duplicates. Note that this
 * problem is different from Recursively remove all adjacent duplicates. Here we
 * keep one character and remove all subsequent same characters.
 * 
 * Examples:
 * 
 * Input : aaaaabbbbbb Output : ab
 * 
 * Input : geeksforgeeks Output : geksforgeks
 * 
 * Input : aabccba Output : abcba
 * 
 * @author kmamani
 *
 */
public class RemoveDuplicate1 {
	public static void main(String[] args) {
		RemoveDuplicate1 rd = new RemoveDuplicate1();
		String str = "aaaaabbbbbb";
		char[] removeDuplicateChar = rd.removeDuplicateChar(str);
		System.out.println(Arrays.toString(removeDuplicateChar));
	}

	private char[] removeDuplicateChar(String str) {
		int i = 0;
		char arr[] = str.toCharArray();
		// Traversing string
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		System.out.println("Size of J : " + i);

		for (int i1 = 0; i1 <= i; i1++) {
			System.out.print(arr[i1] + " ");
		}
		System.out.println();
		return Arrays.copyOfRange(arr, 0, i + 1);
	}
}
