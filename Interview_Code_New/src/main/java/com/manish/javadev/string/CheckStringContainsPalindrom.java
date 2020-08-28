package com.manish.javadev.string;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class CheckStringContainsPalindrom {
	// static String str = "abmalayalamc";
	static String str = "xLMNMRC";

	public static void main(String[] args) {
		boolean result = testPalindrome(str.toCharArray());
		System.out.println("String Containes palindrome ::: " + result);

	}

	private static boolean testPalindrome(char[] ch) {
		boolean palindromeFlag = false;
		for (int i = 0; i < ch.length; i++) {
			int l = i;
			int k = l + 1;
			if (l >= 0 && k < ch.length && ch[l] == ch[k]) {
				palindromeFlag = true;
				break;
			}
			l = i;
			k = l + 2;
			if (l >= 0 && k < ch.length && ch[l] == ch[k]) {
				palindromeFlag = true;
				break;
			}
		}
		return palindromeFlag;
	}
}
