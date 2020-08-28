package com.manish.javadev.string;

/**
 * This program showing how to use toCharArray() in code
 *
 * @author Manish Srivastava
 */
public class UseOfToCharArray {
	public static void main(String[] args) {
		String str = "javalearningcenter";
		int length = 0;
		length = str.length();
		char chr[] = new char[length];
		chr = str.toCharArray();// toCharArray() Convert String Object into char Array
		for (char ch : chr) {
			System.out.println(ch);
		}
	}

}
