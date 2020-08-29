package com.manish.javadev.string;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class OurOwnTrimFunction {
	public static void main(String[] args) {
		String str = "   Manisha Shivani   . kumar     Srivastva    ";
		System.out.println("Base Length  " + str.length());
		myTrim(str);
	}

	private static void myTrim(String str) {
		char ch = ' ';
		boolean charFound = false;
		String finalString = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch != ' ') {
				if (charFound && str.charAt(i - 1) == ' ') {
					finalString = finalString + str.charAt(i - 1) + ch;
				} else {
					finalString = finalString + ch;
					charFound = true;
				}
			}
		}
		System.out.println("Final String lentgh " + finalString.length());
		System.out.println("Final String  " + finalString);
	}
}
