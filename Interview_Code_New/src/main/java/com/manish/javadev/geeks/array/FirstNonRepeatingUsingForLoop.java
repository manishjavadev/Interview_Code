package com.manish.javadev.geeks.array;

public class FirstNonRepeatingUsingForLoop {

	public static int findRepeatFirstWithOneForLoop(String s) {
		// this is optimized method
		int p = 0, i;

		// initialized counts of occurrences of
		// elements as zero
		int MAX_CHAR = 256;
		int hash[] = new int[MAX_CHAR];

		for (i = 0; i < s.length(); i++) {
			hash[s.charAt(i)]++;
		}

		for (i = 0; i < s.length(); i++) {
			if (hash[s.charAt(i)] == 1) {
				p = i;
				break;
			}
		}
		return p;
	}

	// Driver method
	public static void main(String[] args) {
		String str = "kgeeksforkgeeks";
		int index = findRepeatFirstWithOneForLoop(str);

		System.out.println(index == -1 ? "Either all characters are repeating or string " + "is empty"
				: "First non-repeating character is \n" + str.charAt(index));
	}
}
