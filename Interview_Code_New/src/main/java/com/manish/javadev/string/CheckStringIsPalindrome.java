package com.manish.javadev.string;

/**
 * @author Manish
 *
 */

/**
 * This logic is also work for reverse the string only you remove the if
 * condition and simply print the reverse string.
 * 
 */
public class CheckStringIsPalindrome {
	static String enteredString = "";

	public static void main(String[] args) {
		String enteredString = "MANINAM";
		// 1st logic Method
		boolean resultFlag = checkPalindrom(0, enteredString.length() - 1);

		// 2nd logic Method
		resultFlag = checkPalindrom(enteredString);
		if (resultFlag) {
			System.out.println("Entered String '" + enteredString + "' is Palindrom");
		} else {
			System.out.println("Entered String is not a Palindrom");
		}
	}

	private static boolean checkPalindrom(int i, int j) {
		if (i < j) {
			if (enteredString.charAt(i++) != enteredString.charAt(j--)) {
				return false;
			}
			checkPalindrom(i, j);
		}
		return true;
	}

	private static boolean checkPalindrom(String str) {
		boolean flag = false;
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
		while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
			flag = true;

			low--;
			high++;
		}
		return flag;
	}
}
