package com.manish.javadev.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheLinkedHashMap {

	private LinkedHashMap<Integer, Integer> map;
	private final int CAPACITY;

	public LRUCacheLinkedHashMap(int capacity) {
		CAPACITY = capacity;
		map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f) {
			protected boolean removeEldestEntry(Map.Entry eldest) {
				return size() > CAPACITY;
			}
		};
	}

	// This method works in O(1)
	public int get(int key) {
		System.out.println("Going to get the value " + "for the key : " + key);
		return map.getOrDefault(key, -1);
	}

	// This method works in O(1)
	public void set(int key, int value) {
		System.out.println("Going to set the (key, " + "value) : (" + key + ", " + value + ")");
		map.put(key, value);
	}
}
