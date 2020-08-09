package com.manish.javadev.geeks.array;

import java.util.HashMap;

public class CharCountUsingForLoopAndMap {

	static char arr[] = { 'a', 'b', 'c', 'd', 'c', 'c', 'd', 'd', 'd' };
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
