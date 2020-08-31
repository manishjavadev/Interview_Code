package com.manish.javadev.geeks.string;

/**
 * https://www.youtube.com/watch?v=GuTPwotSdYw
 * 
 * TEST ONLINE: https://www.careerbless.com/calculators/word/list.php
 * 
 * @author m.d.srivastava
 *
 */
public class StringPermutation1 {

	public static void main(String[] args) {
		String str = "AABC";
		int n = str.length();
		StringPermutation1 permutation = new StringPermutation1();
		permutation.permute(str, 0, n - 1);
	}

	private void permute(String str, int l, int h) {
		if (l == h)
			System.out.println(str);
		else {
			for (int i = l; i <= h; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, h);
				str = swap(str, l, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}