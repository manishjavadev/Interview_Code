package com.manish.javadev.string;

/**
 * @author Manish
 *
 */

/**
 * This logic is also work for reverse the string only you remove the if
 * condition and simply print the reverse string.
 * 
 * FOR ODD::=> If your entered string length is odd then mid-1 and mid+1 should
 * be same and rest also will same(increasing and decreasing)
 * 
 * FOR EVEN::=> If your entered string length is even then mid-1 and mid should
 * be same and rest also will same(increasing and decreasing)
 * 
 */
public class CheckStringIsPalindrome {
	static String enteredString = "NMANAMNOO";

	public static void main(String[] args) {

		// 1st logic Method
		boolean resultFlag = checkPalindrom(0, enteredString.length() - 1);

		if (resultFlag) {
			System.out.println("Entered String '" + enteredString + "' is Palindrom");
		} else {
			System.out.println("Entered String is not a Palindrom");
		}
		System.out.println("========2nd logic Method========");
		// 2nd logic Method
		boolean result = checkPalindrom(enteredString);
		if (result) {
			System.out.println("Entered String '" + enteredString + "' is Palindrom");
		} else {
			System.out.println("Entered String is not a Palindrom");
		}
	}

	private static boolean checkPalindrom(int i, int j) {
		if (i < j) {
			if (enteredString.charAt(i) != enteredString.charAt(j)) {
				return false;
			} else {
				checkPalindrom(i + 1, j - 1);
			}

		}
		return true;
	}

	private static boolean checkPalindrom(String str) {
		boolean flag = true;
		int low = 0;
		int high = 0;
		int len = str.length();
		if (len % 2 == 0) {
			low = len / 2 - 1;
			high = len / 2;
		}
		if (len % 2 != 0) {
			low = len / 2 - 1;
			high = len / 2 + 1;
		}
		while (low >= 0 && high < len && flag) {
			flag = str.charAt(low) == str.charAt(high) ? true : false;
			low--;
			high++;
		}
		return flag;
	}
}
