package com.manish.javadev.string;

/**
 * @author Manish Srivastava
 */
public class FindSubStringInString {
	public boolean contains() {

		String str = "manish";
		String str2 = "ani";
		char chr1[] = str.toCharArray();
		char chr2[] = str2.toCharArray();
		int i = 0, j = 0;
		boolean flage = false;
		while ((i < chr1.length) && (j < chr2.length)) {
			if (chr1[i] == chr2[j]) {
				i++;
				j++;
				if (j == chr2.length) {
					return true;
				}
			} else {
				i++;
				j = 0;
			}
		}
		return flage;
	}

	public static void main(String[] args) {
		FindSubStringInString fis = new FindSubStringInString();
		boolean flag = fis.contains();
		if (flag) {
			System.out.println("Sub String is found");
		} else {
			System.out.println("Sub String is not found");
		}
	}
}
