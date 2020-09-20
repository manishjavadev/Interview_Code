package com.manish.javadev.geeks.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://www.youtube.com/watch?v=nYFd7VHKyWQ
 * 
 * TEST ONLINE: https://www.careerbless.com/calculators/word/list.php
 * 
 * Generate all permutations of string in lexicographically sorted order where
 * repetitions of character is possible in string.
 * 
 * @author m.d.srivastava
 *
 */
public class StringPermutation {

	public List<String> permute(char input[]) {
		Map<Character, Integer> countMap = new TreeMap<>();
		for (char ch : input) {
			countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);

			/*
			 * OR
			 * 
			 * Above code you can also write
			 * 
			 * countMap.compute(ch, (key, val) -> { if (val == null) { return 1; } else {
			 * return val + 1; } });
			 */
		}
		System.out.println(countMap);
		System.out.println("===========");
		char str[] = new char[countMap.size()];
		int count[] = new int[countMap.size()];
		int index = 0;
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			str[index] = entry.getKey();
			count[index] = entry.getValue();
			index++;
		}
		List<String> finalResultList = new ArrayList<>();
		char result[] = new char[input.length];
		permuteUtil(str, count, 0, result, finalResultList);
		return finalResultList;
	}

	public void permuteUtil(char str[], int count[], int level, char result[], List<String> finalResultList) {
		if (level == result.length) {
			// finalResultList.add(new String(result)); OR
			System.out.println(new String(result));
			return;
		}

		for (int i = 0; i < str.length; i++) {
			if (count[i] == 0) {
				continue;
			}
			result[level] = str[i];
			count[i]--;
			permuteUtil(str, count, level + 1, result, finalResultList);
			/**
			 * count[i]++ means restore count at previous level(just for backtracking)
			 */
			count[i]++;
		}
	}

	public static void main(String args[]) {
		StringPermutation sp = new StringPermutation();
		List<String> result = sp.permute("AABC".toCharArray());
		result.forEach(s -> System.out.println(s));
	}
}