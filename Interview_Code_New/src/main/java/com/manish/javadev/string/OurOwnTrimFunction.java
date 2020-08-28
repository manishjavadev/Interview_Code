package com.manish.javadev.string;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class OurOwnTrimFunction {
	public static void main(String[] args) {
		String str = "   Manish kumar     Srivastva    ";
		System.out.println("Base Length  " + str.length());
		myTrim(str);
	}

	private static void myTrim(String str) {
		char ch = ' ';
		boolean chFlag = false;
		boolean added = false;
		String fStr = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			added = false;
			// Here i am checking space, but flag for space in between of String

			if (ch != ' ' && chFlag) {
				if (str.charAt(i - 1) == ' ') {
					fStr = fStr + str.charAt(i - 1) + ch;
					added = true;
				}
			}

			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				if (!added) {
					fStr = fStr + ch;
					chFlag = true;
				}
			}
		}
		System.out.println("Final String lentgh " + fStr.length());
		System.out.println("Final String  " + fStr);
	}
}
