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

		for (int i = chr.length - 1; i >= 0; i--) {
			reverseString = reverseString + enteredString.charAt(i);
		}

		System.out.println("Reverse String is this "+reverseString);
	}

}
