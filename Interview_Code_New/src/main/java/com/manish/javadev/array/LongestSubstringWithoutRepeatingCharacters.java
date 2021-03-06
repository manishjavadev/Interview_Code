package com.manish.javadev.array;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		char s[] = "abcabcdbb".toCharArray();
		int count = 1;
		int maxcount = 1;
		String result = String.valueOf(s[0]);
		String finalresult = "";

		for (int i = 1; i < s.length; i++) {
			if (!result.contains(String.valueOf(s[i]))) {
				result = result + s[i]; // abc 3
				count++;
			} else {
				if (count > maxcount) {
					finalresult = result;
					maxcount = count;
				}
				result = String.valueOf(s[i]);
				count = 1;
			}
		}
		System.out.println("Finalresult  " + finalresult.length());
	}
}
