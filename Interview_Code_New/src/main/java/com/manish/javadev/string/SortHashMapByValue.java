package com.manish.javadev.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class SortHashMapByValue {

	public List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap) {

		Set<Entry<String, Integer>> set = wordMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		return list;
	}

	public static void main(String a[]) {
		SortHashMapByValue dmdwc = new SortHashMapByValue();
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		wordMap.put("A", 2);
		wordMap.put("BC", 5);
		wordMap.put("DA", 1);
		wordMap.put("JA", 2);
		wordMap.put("HG", 7);
		List<Entry<String, Integer>> list = dmdwc.sortByValue(wordMap);
		System.out.println(
				"Max repeted Word : " + list.get(0).getKey() + ", And Max repeted count : " + list.get(0).getValue());
		for (Entry<String, Integer> entry : list) {
			System.out.println("Key  = " + entry.getKey() + " And Value= " + entry.getValue());
		}
	}
}
