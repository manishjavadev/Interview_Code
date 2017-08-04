package com.manish.javadev.string;

import java.util.Scanner;

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

		String reverseString = "";
		char chr[];

		System.out.println("Please enter String");

		Scanner sc = new Scanner(System.in);
		enteredString = sc.next();
		chr = enteredString.toCharArray();
		boolean resultFlag = checkPalindrom(0, enteredString.length() - 1);
		if (resultFlag) {
			System.out.println("Entered String is Palindrom");
		} else {
			System.out.println("Entered String is not a Palindrom");
		}

		/*
		 * for (int i = chr.length - 1; i >= 0; i--) { reverseString =
		 * reverseString + enteredString.charAt(i); }
		 * 
		 * if (enteredString.equals(reverseString))
		 * System.out.println("Entered string is palindrome"); else
		 * System.out.println("Entered string is not a palindrome");
		 */}

	private static boolean checkPalindrom(int i, int j) {
		int start = i;
		int end = j;
		if (i < j) {
			if (enteredString.charAt(i) != enteredString.charAt(j)) {
				return false;
			}
			checkPalindrom(++start, --end);
		}
		return true;

	}

}
