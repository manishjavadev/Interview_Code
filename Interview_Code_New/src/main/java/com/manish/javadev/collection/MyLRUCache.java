package com.manish.javadev.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLRUCache<K, V> extends LinkedHashMap<K, V> {
	
	public static void main(String[] args) {
		MyLRUCache<Integer, Integer> cache =  new MyLRUCache<Integer, Integer>(3);
		MyLRUCache<Integer, Integer> map  = cache.newInstance(3);
		map.put(10, 10);
		map.put(20, 20);
		map.put(30, 30);
		map.put(40, 40);
		map.put(20, 30);
		System.out.println(map);
	}

	private static final long serialVersionUID = -4622177786359540728L;
	private int size;

	private MyLRUCache(int size) {
		super(size, 0.75f, true);
		this.size = size;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > size;
	}

	public MyLRUCache<K, V> newInstance(int size) {
		return new MyLRUCache<K, V>(size);
	}
}