package com.manish.javadev.geeks.array;

public class FirstNonRepeatingUsingForLoop {

	public static int findFirstNonRepeatingChar(String s) {
		// this is optimized method
		int i;

		// initialized counts of occurrences of
		// elements as zero
		int MAX_CHAR = 256;
		int hash[] = new int[MAX_CHAR];

		for (i = 0; i < s.length(); i++) {
			hash[s.charAt(i)]++;
		}

		for (i = 0; i < s.length(); i++) {
			if (hash[s.charAt(i)] == 1) {
				return i;
			}
		}
		return i;
	}

	// Driver method
	public static void main(String[] args) {
		//String str = "kgeeksforkgeeks";
		String str = "CLMANNMS";
		int index = findFirstNonRepeatingChar(str);

		System.out.println(index == -1 ? "Either all characters are repeating or string " + "is empty"
				: "First non-repeating character is \n" + str.charAt(index));
	}
}
