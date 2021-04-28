package com.manish.javadev.collection;

import java.util.ArrayList;
import java.util.Collections;
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
public class SortHashMapByValueUsingLambda {

	public List<Entry<Integer, Employee>> sortByValue(Map<Integer, Employee> wordMap) {

		Set<Map.Entry<Integer, Employee>> set = wordMap.entrySet();
		List<Map.Entry<Integer, Employee>> list = new ArrayList<Map.Entry<Integer, Employee>>(set);
		Collections.sort(list, (o1, o2) -> -o1.getValue().getName().compareTo(o2.getValue().getName()));
		return list;
	}

	public static void main(String a[]) {
		SortHashMapByValueUsingLambda dmdwc = new SortHashMapByValueUsingLambda();
		Map<Integer, Employee> wordMap = new HashMap<Integer, Employee>();
		wordMap.put(10, new Employee(10, "Manish1"));
		wordMap.put(20, new Employee(20, "Manish2"));
		wordMap.put(30, new Employee(30, "Manish3"));
		wordMap.put(40, new Employee(40, "Manish4"));
		wordMap.put(50, new Employee(50, "Manish5"));

		List<Entry<Integer, Employee>> list = dmdwc.sortByValue(wordMap);
		System.out.println(
				"Max repeted Word : " + list.get(0).getKey() + ", And Max repeted count : " + list.get(0).getValue());
		for (Entry<Integer, Employee> entry : list) {
			System.out.println("Key  = " + entry.getKey() + " And Value= " + entry.getValue());
		}
	}
}
