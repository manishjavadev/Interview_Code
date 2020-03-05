package com.manish.javadev.geeks.array;

public class CharCountAdjacenttoChar {
	public static void main(String[] args) {
		char ch[] = { 'a', 'b', 'c', 'c', 'c', 'd', 'd' };
		System.out.println(ch);

		int count = 0;
		char temp = ' ';
		String finalResult = "";
		for (int i = 0; i < ch.length; i++) {
			if (count == 0) {
				temp = ch[i];
			}
			if (temp == ch[i]) {
				count++;
			} else {
				finalResult = finalResult + temp + count;
				count = 1;
				temp = ch[i];
			}
			if (i == ch.length - 1) {
				finalResult = finalResult + temp + count;
			}
		}
		System.out.println(ch = finalResult.toCharArray());
	}
}
