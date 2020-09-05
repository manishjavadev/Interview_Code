package com.manish.javadev.string;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class CheckStringContainsPalindrom {
	static String str = "abmalayalamc";
	// static String str = "abmalRayWaRlamc";
	// static String str = "SrABA";

	public static void main(String[] args) {
		boolean result = testPalindrome(str.toCharArray());
		if (result) {
			System.out.println("String Containes palindrome ::: " + result);
		} else {
			System.out.println("String Does Not Containes palindrome ::: " + result);
		}
	}

	private static boolean testPalindrome(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			int l = i;
			int k = l + 1;
			if (l >= 0 && k < ch.length && ch[l] == ch[k]) {
				return true;
			}
			l = i;
			k = l + 2;
			if (l >= 0 && k < ch.length && ch[l] == ch[k]) {
				return true;
			}
		}
		return false;
	}
}
