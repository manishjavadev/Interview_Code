package com.manish.javadev.geeks.array;

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
public class FindFirstRepeatCharWithOrderOfN2 {
	public static int findRepeatFirst(String str) {
		// this is optimized method
		int p = 0;

		int MAX_CHAR = 256;
		int hash[] = new int[MAX_CHAR];

		for (int i = 0; i < str.length(); i++) {
			hash[str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (hash[str.charAt(i)] > 1) {
				p = i;
				System.out.println("First reapeted Char " + str.charAt(i));
				break;
			}
		}
		return p;
	}

	// Driver code
	public static void main(String[] args) {
		String str = "MNNRRM";
		// String str = "geeksforgeeks";
		int pos = findRepeatFirst(str);
		if (pos == -1)
			System.out.println("Not found");
		else
			System.out.println(str.charAt(pos));
	}
}
