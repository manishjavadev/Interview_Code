package com.manish.javadev.geeks.linkedlist;

/**
 * http://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
 * 
 * Method 2 (Use two pointers) Maintain two pointers – reference pointer and
 * main pointer. Initialize both reference and main pointers to head. First move
 * reference pointer to n nodes from head. Now move both pointers one by one
 * until reference pointer reaches end. Now main pointer will point to nth node
 * from the end. Return main pointer.
 * 
 * 
 * 
 * @author Manish
 * 
 */
public class FindNthNodeFromLastWithOnDemo {

	public static void main(String[] args) {
		// fnd.displayNodes();
		Entity entity = DefaultLinkedList.getDefaultLinkedList();
		Entity result = getNthNodeFromLast(entity, 2);
		System.out.println(result.data);
	}

	private static Entity getNthNodeFromLast(Entity entity, int nthNode) {
		Entity refEntity = entity;
		Entity mainEntity = entity;

		if (refEntity == null) {
			return null;
		}
		for (int counter = 0; counter < nthNode; counter++) {
			if (refEntity == null) {
				System.out.println(nthNode + " is greater than the no "
						+ " of nodes in the list");
				return null;
			}
			refEntity = refEntity.next;
		}
		while (refEntity != null) {
			mainEntity = mainEntity.next;
			refEntity = refEntity.next;
		}
		return mainEntity;
	}
}
