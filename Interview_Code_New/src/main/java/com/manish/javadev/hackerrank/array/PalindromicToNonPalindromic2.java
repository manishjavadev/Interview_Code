package com.manish.javadev.hackerrank.array;

/**
 * @author Manish
 *
 */

/**
 * This program is simply taking input from user and displaying a matrix.
 * 
 */
public class PalindromicToNonPalindromic2 {

	// Driver Code
	public static void main(String[] args) {
		String str = "cabbac";

		findNonPalinString(str);
	}

	// Function to print the non-palindromic string
	// if it exists, otherwise prints -1
	static void findNonPalinString(String str) {
		int freq[] = new int[256];
		int flag = 0;

		for (int i = 0; i < str.length(); i++) {

			// If all characters are not same, set flag to 1
			if (str.charAt(i) != str.charAt(0))
				flag = 1;

			// Update frequency of the current character
			freq[str.charAt(i)]++;
		}

		// If all characters are same
		if (flag == 0)
			System.out.println("-1");
		else {
			for (int i = 0; i < freq.length; i++) {
				if (freq[i] > 0) {
					for (int j = 0; j < freq[i] ; j++) {
						System.out.print((char)i);
					}
					//System.out.print("");
				}
			}
		}
	}
}
