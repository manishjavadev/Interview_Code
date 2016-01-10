package com.manish.javadev.collection;




public class MyOwnHashMap {
	private int size;
	private static Entry[] element;
	int index;

	public MyOwnHashMap() {
		size = 20;
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
			return null;
		int hash = hash(key.hashCode());
		int i = indexFor(hash, element.length);
		Entry e = element[i];
		while (e != null) {
			if (e.key.equals(key)) {
				return e;
			}
			e = e.next;
		}
		return null;
	}

	/*
	 * public int hashCode() { return index; }
	 */

	public void put(String key, String value) {
		Entry entryForBukket = new Entry(key, value);
		if (key == null)
			return;
		int hash = hash(key.hashCode());
		int i = indexFor(hash, element.length);
		Entry e = element[i];
		if (e != null) {
			if (e.key.equals(key)) {
				e.value = value;
			} else {
				while (e.next != null) {
					e = e.next;
				}
				e.next = entryForBukket;
			}
		} else {
			element[i] = entryForBukket;
		}

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

}

class TestMyOwnHashMap {
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