package com.manish.javadev.geeks.string;

public class MaxOccurrenceOfChar {
	public static void main(String[] args) {
		String str = "ssamptle sttring";
		System.out.println("Max occurring character is " + getMaxOccuringChar(str));
	}

	private static String getMaxOccuringChar(String str) {

		int count[] = new int[256];

		// Construct character count array from the input
		// string.
		int len = str.length();
		for (int i = 0; i < len; i++) {
			count[str.charAt(i)]++;
		}

		int max = -1; // Initialize max count
		String result = ""; // Initialize result

		// Traversing through the string and maintaining
		// the count of each character
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = String.valueOf(str.charAt(i));
			}
		}

		return result;
	}
}
