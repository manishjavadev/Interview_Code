package com.manish.javadev.hackerrank.array;

/**
 * 
 * Input : s = "bca" roll[] = {1, 2, 3} Output : eeb
 * 
 * Explanation : arr[0] = 1 means roll first character of string -> cca
 * 
 * arr[1] = 2 means roll first two characters of string -> dda
 * 
 * arr[2] = 3 means roll first three characters of string -> eeb So final ans is
 * "eeb"
 * 
 * Input : s = "zcza" roll[] = {1, 1, 3, 4} Output : debb
 * 
 * @author kmamani
 *
 */
public class RollCharactersOfString {
	public static void main(String[] args) {
		// char[] str = { 'b', 'c', 'a' };
		char[] str = { 'z', 'c', 'z', 'a' };
		char[] result = new char[str.length];
		int roll[] = { 1, 1, 3, 4 };
		rollCharacters(str, roll, 0);
	}

	private static void rollCharacters(char[] str, int[] roll, int level) {
		if (str.length == level) {
			System.out.println(new String(str));
			return;
		}
		for (int i = 0; i < roll[level]; i++) {
			char res = str[i];
			if ((char) res == 'z' || (char) res == 'Z') {
				res = (char) (res - 26);
			}
			str[i] = (char) (res + 1);
		}
		rollCharacters(str, roll, level + 1);
	}
}
