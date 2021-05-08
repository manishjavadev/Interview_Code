package com.manish.javadev.collection;

import java.util.HashMap;

/**
 * 2.
 * 
 * Optimized Approach:
 * 
 * The key to solve this problem is using a double linked list which enables us
 * to quickly move nodes. The LRU cache is a hash map of keys and double linked
 * nodes. The hash map makes the time of get() to be O(1). The list of double
 * linked nodes make the nodes adding/removal operations O(1).
 * 
 * Code using Doubly Linked List and HashMap:
 * 
 * @author kmamani
 *
 */
public class LRUCacheUsingMap {

	// Here i am setting 4 to test the LRU cache implementation, it can make be
	// dynamic
	HashMap<Integer, Node> hashmap;
	Node start, end;
	int LRU_SIZE = 4;

	public LRUCacheUsingMap() {
		hashmap = new HashMap<Integer, Node>();
	}

	// Key Already Exist, just update the
	public int getEntry(int key) {
		if (hashmap.containsKey(key)) {
			Node entry = hashmap.get(key);
			removeNode(entry);
			addAtTop(entry);
			return entry.value;
		}
		return -1;
	}

	public void putEntry(int key, int value) {
		// Key Already Exist, just update the value and move it to top
		if (hashmap.containsKey(key)) {
			Node entry = hashmap.get(key);
			entry.value = value;
			removeNode(entry);
			addAtTop(entry);
		} else {
			Node newnode = new Node(key, value);
			// We have reached maxium size so need to make room for new element.
			if (hashmap.size() >= LRU_SIZE) {
				hashmap.remove(start.key);
				removeNode(start);
				addAtTop(newnode);
			} else {
				addAtTop(newnode);
			}

			hashmap.put(key, newnode);
		}
	}

	public void addAtTop(Node node) {

		if (start == null)
			start = node;
		else {
			node.right = end.right;
			end.right = node;
			node.left = end;
		}
		end = node;
	}

	public void removeNode(Node node) {

		if (node.left == null) {
			start = node.right;
			node.right.left = null;

		} else {
			node.left.right = node.right;
			node.right.left = node.left;
		}

		if (node.right == null) {
			end = node.left;
			end.right = null;

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

		// System.out.println(lrucache.getEntry(1));
		// System.out.println(lrucache.getEntry(10));
		// System.out.println(lrucache.getEntry(15));

		lrucache.iterate();
	}

	// Iterate the double linked list
	public void iterate() {
		Node e = start;
		while (e != null) {
			System.out.println("KEY :: " + e.key + " VALUE :: " + e.value);
			e = e.right;
		}
	}

	static class Node {
		int value;
		int key;
		Node left;
		Node right;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

}
