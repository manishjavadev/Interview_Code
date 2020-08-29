package com.manish.javadev.string;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class OurOwnTrimFunction {
	public static void main(String[] args) {
		String str = "   Manisha Shivani   . kumar     Srivastva    ";
		String str1 = "   Hello Geeks          . Welcome   to    GeeksforGeeks   .    ";
		System.out.println("Base Length  " + str1.length());
		myTrim(str1);
	}

	private static void myTrim(String str) {
		char ch = ' ';
		boolean charFound = false;
		String finalString = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch != ' ') {
				/**
				 * This if block will used for first char of 2nd, 3rd are other starting word
				 */
				if (charFound && str.charAt(i - 1) == ' ') {
					finalString = finalString + str.charAt(i - 1) + ch;
				}
				/**
				 * This is else block will used for all char
				 */
				else {
					finalString = finalString + ch;
					charFound = true;
				}
			}
		}
		System.out.println("Final String lentgh " + finalString.length());
		System.out.println("Final String  " + finalString);
	}
}
