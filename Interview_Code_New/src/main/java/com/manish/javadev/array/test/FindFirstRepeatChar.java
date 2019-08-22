package com.manish.javadev.array.test;

/**
 * https://www.geeksforgeeks.org/find-repeated-character-present-first-string/
 * 
 * This solution is optimized by using the following techniques:
 * 
 * 1. We loop through the string and hash the characters using ASCII codes.
 * Store 1 if found and store 2 if found again.
 * 
 * Also, store the position of the letter first found in.
 * 
 * 2. We run a loop on the hash array and now we find the minimum position of
 * any character repeated.
 * 
 * This will have a runtime of O(N).
 * 
 * @author kmamani
 *
 */
public class FindFirstRepeatChar {
	public static int findRepeatFirst(String s) {
		// this is optimized method
		int p = -1, i, k;

		// initialized counts of occurrences of
		// elements as zero
		int MAX_CHAR = 256;
		int hash[] = new int[MAX_CHAR];

		// initialized positions
		int pos[] = new int[MAX_CHAR];

		for (i = 0; i < s.length(); i++) {
			k = (int) s.charAt(i);
			if (hash[k] == 0) {
				hash[k]++;
				pos[k] = i;
			} else if (hash[k] == 1)
				hash[k]++;
		}

		for (i = 0; i < MAX_CHAR; i++) {
			if (hash[i] == 2) {
				if (p == -1) // base case
					p = pos[i];
				else if (p > pos[i])
					p = pos[i];
			}
		}

		return p;
	}

	// Driver code
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		int pos = findRepeatFirst(str);
		if (pos == -1)
			System.out.println("Not found");
		else
			System.out.println(str.charAt(pos));
	}
}
