package com.manish.javadev.geeks.array;

/**
 * Count Adjacent Char in array
 * 
 * Input abcccdd and OutPut a1b1c3d2
 * 
 * @author kmamani
 *
 */
public class CharCountAdjacenttoChar {
	public static void main(String[] args) {
		char ch[] = { 'a', 'b', 'c', 'c', 'c', 'd', 'd' };
		System.out.println(ch);

		int count = 1;
		char temp = ch[0];
		String finalResult = "";
		for (int i = 1; i < ch.length; i++) {

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
