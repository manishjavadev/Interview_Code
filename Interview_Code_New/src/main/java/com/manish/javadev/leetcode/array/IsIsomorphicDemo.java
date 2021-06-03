package com.manish.javadev.leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IsIsomorphicDemo {
	public static void main(String[] args) {
		// String s1 = "egg";
		// String s2 = "add";
		String s1 = "foo";
		String s2 = "bar";
		boolean result = isIsomorphic(s1, s2);
		System.out.println("Result :::" + result);
		
		boolean result1 = isIsomorphic1(s1, s2);
		System.out.println("Result :::" + result1);
	}

	private static boolean isIsomorphic(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
		}
		char ch1[] = s2.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			map2.put(ch1[i], map2.getOrDefault(ch1[i], 0) + 1);
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Iterator iterator = entrySet.iterator(); iterator.hasNext();) {
			Entry<Character, Integer> entry = (Entry<Character, Integer>) iterator.next();
			boolean validate2ndMap = validate2ndMap(entry.getValue(), map2);
			if (!validate2ndMap) {
				return false;

			}

		}
		return true;
	}

	private static boolean validate2ndMap(Integer v, Map<Character, Integer> map2) {

		return map2.containsValue(v);
	}

	public static boolean isIsomorphic1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if (map.containsKey(c1)) {
				if (map.get(c1) != c2) {
					return false;
				}
			} else {
				map.put(c1, c2);
			}
		}
		HashSet<Character> set = new HashSet<>(map.values());
		if (set.size() == map.values().size()) {
			return true;
		}
		return false;
	}

}
