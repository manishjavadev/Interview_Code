package com.manish.javadev.string;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class ReverseStringUsingRecursion {
	static char ch[] = { 'm', 'a', 'n', 'i', 's', 'h' };

	public static void main(String[] args) {

		reverse(ch, 0, ch.length - 1);
		System.out.println(new String(ch));
	}

	private static void reverse(char[] ch, int i, int j) {
		if (i < j) {
			swapData(ch, i, j);
			reverse(ch, i + 1, j - 1);
		}

	}

	private static void swapData(char[] ch2, int i, int j) {
		char tmp = ch[i];
		ch[i] = ch[j];
		ch[j] = tmp;
	}
}
