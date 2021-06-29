package com.manish.javadev.geeks.array;

import java.util.Arrays;

public class TestDemo {
	public static void main(String[] args) {
		TestDemo td = new TestDemo();
		String str = "aaaaabbbbbbccdee";
		char[] removeDuplicateChar = td.removeDuplicateChar(str.toCharArray());
		System.out.println(Arrays.toString(removeDuplicateChar));
	}

	private char[] removeDuplicateChar(char[] ch) {
		char temp = ch[0];
		int count = 0;
		String str = "";
		int i = 0;
		for (i = 1; i < ch.length; i++) {
			if (temp == ch[i]) {
				count++;
			} else {
				str = str + temp + count;
				temp = ch[i];
				count = 1;
			}

		}
		if (i == ch.length) {
			str = str + temp + count;
		}
		return str.toCharArray();
	}
}
