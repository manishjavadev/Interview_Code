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
		Entity result = getNthNodeFromLast(entity, 3);
		if (result != null) {
			System.out.println(result.data);
		} else {
			System.out.println("May be root is empty or nth node 0");
		}

	}

	private static Entity getNthNodeFromLast(Entity root, int nthNode) {
		Entity refEntity = root;
		Entity mainEntity = root;
		if (nthNode == 0) {
			return null;
		}
		for (int counter = 0; counter < nthNode && refEntity != null; counter++) {
			refEntity = refEntity.next;
		}
		if (refEntity == null) {
			return null;
		}
		while (refEntity != null) {
			mainEntity = mainEntity.next;
			refEntity = refEntity.next;
		}
		return mainEntity;
	}
}
