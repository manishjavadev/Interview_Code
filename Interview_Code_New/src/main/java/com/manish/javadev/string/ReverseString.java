package com.manish.javadev.string;

public class ReverseString {
	static char ch[] = { 'm', 'a', 'n', 'i', 's', 'h' };

	public static void main(String[] args) {

		reverse(0, ch.length - 1);
		System.out.println(new String(ch));
	}

	private static void reverse(int i, int j) {
		if (i < j) {
			char temp = ch[i];
			ch[i++] = ch[j];
			ch[j--] = temp;
			reverse(i, j);
		}

	}
}
