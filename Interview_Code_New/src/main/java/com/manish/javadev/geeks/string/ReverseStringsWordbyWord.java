package com.manish.javadev.geeks.string;

/**
 * 
 * Example: Input:
 * 
 * this is morganstanley interview question
 * 
 * Output:
 * 
 * question interview stanleymorgan is this
 * 
 * Although the questions were not too difficult but due to the time constraints
 * you have to check boundary cases and comments your code properly.
 * 
 * @author kmamani
 *
 */
public class ReverseStringsWordbyWord {
	public static void main(String[] args) {
		String str = "this is morganstanley interview question";
		String reverseStr = reverseStr(str.toCharArray(), 0, str.length() - 1);
		reverseWord(reverseStr.toCharArray());
		System.out.println(new String(reverseStr));

	}

	private static void reverseWord(char[] ch) {
		String word = "";
		String reverseStr = " ";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				reverseStr += reverseStr(word.toCharArray(), 0, word.length() - 1);
				word = "";
				reverseStr += " ";
				
			} else {
				word += ch[i];
			}
			if (i == ch.length-1) {
				reverseStr += reverseStr(word.toCharArray(), 0, word.length() - 1);
			}
		}
		System.out.println("Final Reverse String :::\n" + reverseStr);

	}

	private static String reverseStr(char[] cs, int l, int h) {
		if (l < h) {
			swapData(cs, l, h);
			reverseStr(cs, l + 1, h - 1);
		}
		return new String(cs);

	}

	private static void swapData(char[] cs, int l, int h) {
		char temp = cs[l];
		cs[l] = cs[h];
		cs[h] = temp;
	}

}
