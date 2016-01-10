package com.manish.javadev.string;

public class CheckStringContainsPalindrom {
	static String str = "abmalayalamc";

	public static void main(String[] args) {

		int pos = 0;
		int j = 0;
		int length = str.length() - 1;
		for (int i = 0; i < length; i++) {
			for (int k = length; i < k; k--) {
				if (str.charAt(i) == str.charAt(k)) {
					pos = i;
					j = k;
					if (checkPalidrom(pos, j)) {
						System.out.println("Pos " + pos + "and " + k);
						System.out.println("Yes String contains Palindrom");
						for (int k2 = pos; k2 <= j; k2++) {
							System.out.print(str.charAt(k2));
						}
						System.out.println("\n");
						i = k;
					}
				}
			}
		}
	}

	private static boolean checkPalidrom(int pos, int k) {
		boolean flag = false;
		for (int i = pos, j = k; i < j; i++, j--) {
			if (str.charAt(i) == str.charAt(j)) {
				flag = true;
			} else {
				return flag = false;

			}
		}
		return flag;
	}
}
