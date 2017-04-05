package com.manish.javadev.geeks.linkedlist;

public class LengthOfLinkedListRecursive {
	static int count = 0;

	public static int findLengthUsingRecursive(Entity entity) {
		return getLength(entity);
	}

	private static int getLength(Entity entity) {
		if (entity.next != null) {
			count++;
			getLength(entity.next);
		}
		return (count + 1);
	}

	public static int findLengthUsingIterative(Entity start) {
		count = 1;
		while (start.next != null) {
			count++;
			start = start.next;
		}
		return (count + 1);
	}

}
