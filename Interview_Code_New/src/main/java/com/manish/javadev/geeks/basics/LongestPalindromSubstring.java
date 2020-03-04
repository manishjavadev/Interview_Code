package com.manish.javadev.geeks.basics;

/**
 * https://www.geeksforgeeks.org/longest-palindromic-substring-set-2/
 * 
 * @author kmamani Java implementation of O(n^2)time and O(1)space methodto find
 *         the longest palindromic substring
 */

public class LongestPalindromSubstring {

	public static void main(String[] args) {

		// String str = "forgeeksskeegfor";
		// String str = "BNMLMANISHSINAMRTYI";
		String str = "XSMANINAMTX";
		System.out.println("Length is: " + longestPalSubstr(str));
	}

	/**
	 * This function prints the longest palindrome substring (LPS) of str[]. It
	 * also returns the length of the longest palindrome
	 */
	static int longestPalSubstr(String str) {
		// str = "AXXA";
		int maxLength = 1; // The result (length of LPS)

		int start = 0;
		int len = str.length();

		int low, high;

		// One by one consider every character as center
		// point of even length palindrome
		for (int i = 0; i < len; ++i) {
			// Find the longest even length palindrome with
			// center points as i-1 and i.
			low = i;
			high = i + 1;
			while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				int crrLength = high - low + 1;
				if (crrLength > maxLength) {
					start = low;
					maxLength = crrLength;
				}
				low--;
				high++;
			}

			// One by one consider every character as center
			// point of odd length palindrome
			low = i;
			high = i + 2;
			while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				int crrLength = high - low + 1;
				if (crrLength > maxLength) {
					start = low;
					maxLength = crrLength;
				}
				low--;
				high++;
			}
		}

		System.out.print("Longest palindrome substring is: " + str.substring(start, start + maxLength));
		return maxLength;
	}

}