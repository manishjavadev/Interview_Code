package com.manish.javadev.geeks.array;

import java.util.HashMap;

/**
 * Count number of char in array no matter char are consecutive or not
 * 
 * Input abcccdd and OutPut a1b1c3d2
 * 
 * @author kmamani
 *
 */
public class CharCountUsingForLoopAndMap {

	static char arr[] = { 'a', 'b', 'c', 'd', 'c', 'a', 'c', 'd', 'd', 'b', 'd' };
	static HashMap<Character, Integer> map = new HashMap<Character, Integer>();

	public static void main(String[] args) {
		CharCountUsingForLoopAndMap ffd = new CharCountUsingForLoopAndMap();
		ffd.getDuplicateCount(arr);
		System.out.println(map);
	}

	private void getDuplicateCount(char[] ch) {
		for (int low = 0; low < ch.length; low++) {
			map.put(arr[low], map.getOrDefault(arr[low], 0) + 1);
		}
	}
}
