package com.manish.javadev.string;

/**
 * This program simply reverse the String
 * 
 * @author Manish Srivastava
 */
public class ReverseEnteredString {
	public static void main(String[] args) {

		System.out.println("Please enter String");

		String enteredString = "Manish";
		char[] chr = enteredString.toCharArray();
		reverse(chr, 0, chr.length - 1);
		System.out.println("Reverse String is this " + new String(chr));
	}

	private static void reverse(char[] chr, int l, int h) {
		if (l < h) {
			swapData(chr, l, h);
			reverse(chr, l + 1, h - 1);
		}
	}

	private static void swapData(char[] chr, int l, int h) {
		char tmp = ' ';
		tmp = chr[l];
		chr[l] = chr[h];
		chr[h] = tmp;
	}
}
