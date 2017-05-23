package com.manish.javadev.string;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program simply reverse the String
 * 
 */
public class ReverseEnteredString {
	public static void main(String[] args) {
		String enteredString = "";
		String reverseString = "";
		char chr[];

		System.out.println("Please enter String");
		Scanner sc = new Scanner(System.in);
		enteredString = sc.next();
		chr = enteredString.toCharArray();

		reverse(enteredString, 0, enteredString.length() - 1);

		for (int i = chr.length - 1; i >= 0; i--) {
			reverseString = reverseString + enteredString.charAt(i);
		}

		System.out.println("Reverse String is this " + reverseString);
	}

	private static void reverse(String enteredString, int i, int j) {
		char local;
		if (i < j) {
			char temp = enteredString.charAt(i);
			local=enteredString.charAt(j);
		}
	}

}
