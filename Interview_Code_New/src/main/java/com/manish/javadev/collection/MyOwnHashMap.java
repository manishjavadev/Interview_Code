package com.manish.javadev.collection;

public class MyOwnHashMap {
	private int size;
	private static Entry[] element;
	int index;

	public MyOwnHashMap() {
		size = 16;
		element = new Entry[size];
	}

	static class Entry {
		final String key;
		String value;
		Entry next;

		public Entry(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return key;
		}
	}

	public Entry get(String key) {
		if (key == null)
			return element[0];
		int hash = hash(key.hashCode());
		int i = indexFor(hash, element.length);
		Entry oldEntity = element[i];
		while (oldEntity != null) {
			if (oldEntity.key.equals(key)) {
				return oldEntity;
			}
			oldEntity = oldEntity.next;
		}
		return null;
	}

	/*
	 * public int hashCode() { return index; }
	 */

	public void put(String key, String value) {
		if (key == null)
			createEntryForNullKey(key, value);
		int hash = hash(key.hashCode());
		int i = indexFor(hash, element.length);
		Entry oldEntry = element[i];
		while (oldEntry != null) {
			if (oldEntry.getKey().equals(key)) {
				oldEntry.value = value;
				return;
			}
			oldEntry = oldEntry.next;
		}
		Entry newEntry = new Entry(key, value);
		newEntry.next = oldEntry;
		element[i] = newEntry;
	}

	private void createEntryForNullKey(String key, String value) {
		Entry newEntry = new Entry(key, value);
		element[0] = newEntry;
	}

	static int hash(int h) {
		// This function ensures that hashCodes that differ only by
		// constant multiples at each bit position have a bounded
		// number of collisions (approximately 8 at default load factor).
		h ^= (h >>> 20) ^ (h >>> 12);
		return h ^ (h >>> 7) ^ (h >>> 4);
	}

	/**
	 * Returns index for hash code h.
	 */
	static int indexFor(int h, int length) {
		return h & (length - 1);
	}

	public static void main(String[] args) {

		MyOwnHashMap mohm = new MyOwnHashMap();

		mohm.put("Manish", "Amba Research");
		mohm.put("Manish", "SISA Tech");
		mohm.put("Rakesh", "Rakesh UST Global");
		mohm.put("Pawan", "Samsung");

		MyOwnHashMap.Entry e = mohm.get("Manish");
		System.out.println("" + e.getValue());
	}

}
