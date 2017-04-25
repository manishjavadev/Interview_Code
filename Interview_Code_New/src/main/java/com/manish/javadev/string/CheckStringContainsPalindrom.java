package com.manish.javadev.string;

public class CheckStringContainsPalindrom {
	static String str = "abmalayalamc";

	public static void main(String[] args) {

		int start = 0;
		int end = 0;
		int length = str.length() - 1;
		for (int i = 0; i < length; i++) {
			for (int k = length; i < k; k--) {
				if (str.charAt(i) == str.charAt(k)) {
					start = i;
					end = k;
					if (checkPalidrom(start, end)) {
						System.out.println("Pos " + start + "and " + k);
						System.out.println("Yes String contains Palindrom");
						System.out.print(str.substring(start, end + 1));
						System.out.println("\n");
						i = end;
					}
				}
			}
		}
	}

	private static boolean checkPalidrom(int pos, int k) {
		boolean flag = false;
		while (pos < k) {
			if (str.charAt(pos++) == str.charAt(k--)) {
				flag = true;
			} else {
				flag = false;
			}
		}
		return flag;
	}
}
