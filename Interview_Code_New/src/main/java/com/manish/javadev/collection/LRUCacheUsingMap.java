package com.manish.javadev.collection;

import java.util.HashMap;

public class LRUCacheUsingMap {

	// Here i am setting 4 to test the LRU cache implementation, it can make be
	// dynamic
	HashMap<Integer, Entry> hashmap;
	Entry start, end;
	int LRU_SIZE = 4;

	public LRUCacheUsingMap() {
		hashmap = new HashMap<Integer, Entry>();
	}

	// Key Already Exist, just update the
	public int getEntry(int key) {
		if (hashmap.containsKey(key)) {
			Entry entry = hashmap.get(key);
			removeNode(entry);
			addAtTop(entry);
			return entry.value;
		}
		return -1;
	}

	public void putEntry(int key, int value) {
		// Key Already Exist, just update the value and move it to top
		if (hashmap.containsKey(key)) {
			Entry entry = hashmap.get(key);
			entry.value = value;
			removeNode(entry);
			addAtTop(entry);
		} else {
			Entry newnode = new Entry(key, value);
			// We have reached maxium size so need to make room for new element.
			if (hashmap.size() > LRU_SIZE) {
				hashmap.remove(start.key);
				removeNode(start);
				addAtTop(newnode);
			} else {
				addAtTop(newnode);
			}

			hashmap.put(key, newnode);
		}
	}

	public void addAtTop(Entry node) {

		if (start == null)
			start = node;
		else {
			end.right = node;
			node.left = end;
		}
		end = node;
	}

	public void removeNode(Entry node) {

		if (node.left != null) {
			node.left.right = node.right;
		} else {
			start = node.right;
		}

		if (node.right != null) {
			node.right.left = node.left;
		} else {
			end = node.left;
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		LRUCacheUsingMap lrucache = new LRUCacheUsingMap();
		lrucache.putEntry(1, 1);
		lrucache.putEntry(10, 15);
		lrucache.putEntry(15, 10);
		lrucache.putEntry(10, 16);
		lrucache.putEntry(12, 15);
		lrucache.putEntry(18, 10);
		lrucache.putEntry(13, 16);

		System.out.println(lrucache.getEntry(1));
		System.out.println(lrucache.getEntry(10));
		System.out.println(lrucache.getEntry(15));

	}
}

class Entry {
	int value;
	int key;
	Entry left;
	Entry right;

	public Entry(int key, int value) {
		this.key = key;
		this.value = value;
	}
}
