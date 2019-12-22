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
public class RemoveDuplicate {
	public static void main(String[] args) {
		RemoveDuplicate rd = new RemoveDuplicate();
		String str = "geeksforgeeks";
		char[] removeDuplicateChar = rd.removeDuplicateChar(str);
		System.out.println(Arrays.toString(removeDuplicateChar));
	}

	private char[] removeDuplicateChar(String str) {
		int j = 0;
		char arr[] = str.toCharArray();
		// Traversing string
		for (int i = 1; i < arr.length; i++) {
			if (arr[j] != arr[i]) {
				j++;
				arr[j] = arr[i];
			}
		}
		System.out.println("Size of J : " + j);

		for (int i = 0; i <= j; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return Arrays.copyOfRange(arr, 0, j + 1);
	}

	/**
	 * void removeDuplicates(char* S) { // When string is empty, return if (S[0]
	 * == '\0') return;
	 * 
	 * // if the adjacent characters are same if (S[0] == S[1]) {
	 * 
	 * // Shift character by one to left int i = 0; while (S[i] != '\0') { S[i]
	 * = S[i + 1]; i++; }
	 * 
	 * // Check on Updated String S removeDuplicates(S); }
	 * 
	 * // If the adjacent characters are not same // Check from S+1 string
	 * address removeDuplicates(S + 1); }
	 * 
	 * 
	 * 
	 */
}
