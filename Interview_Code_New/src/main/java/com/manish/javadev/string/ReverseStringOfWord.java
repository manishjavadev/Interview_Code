package com.manish.javadev.string;

/**
 * This program reversing the word of String at same place for Ex: java
 * development blog reverse String avaj tnempoleved golb
 * 
 * @author Manish Srivastava
 */
public class ReverseStringOfWord {

	public static void main(String[] args) {
		String inputString = "java development blog";
		ReverseStringOfWord rsw = new ReverseStringOfWord();
		String resultString = rsw.doReverse(inputString);
		System.out.println();
		System.out.println(resultString);
	}

	public String doReverse(String inputString) {
		String finlaString = "";
		String getStr = "";

		char ch[] = new char[inputString.length()];
		ch = inputString.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != ' ') {
				getStr = getStr + ch[i];
			} else {
				finlaString += reverse(getStr);
				finlaString = finlaString + " ";
				getStr = "";
			}

			if (i == ch.length - 1)
				finlaString += reverse(getStr);
		}
		return finlaString;
	}

	private String reverse(String str) {
		return reverse(str.toCharArray(), 0, str.length() - 1);
	}

	private static String reverse(char[] chr, int l, int h) {
		if (l < h) {
			swapData(chr, l, h);
			reverse(chr, l + 1, h - 1);
		}
		return new String(chr);
	}

	private static void swapData(char[] chr, int l, int h) {
		char tmp = ' ';
		tmp = chr[l];
		chr[l] = chr[h];
		chr[h] = tmp;
	}
}
