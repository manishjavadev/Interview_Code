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
	Entity entity = DefaultLinkedList.getDefaultLinkedList();

	public static void main(String[] args) {
		FindNthNodeFromLastWithOnDemo fnd = new FindNthNodeFromLastWithOnDemo();
		// fnd.displayNodes();
		fnd.getNthNodeFromLast(6);
	}

	public void displayNodes() {
		Entity tNode = entity;
		while (tNode != null) {
			System.out.print(tNode.data + " ");
			tNode = tNode.next;
		}
	}

	private void getNthNodeFromLast(int nthNode) {
		Entity refEntity = entity;
		Entity mainEntity = entity;
		int counter = 0;
		if (refEntity != null) {
			while (counter < nthNode) {
				if (refEntity == null) {
					System.out.println(nthNode + " is greater than the no "
							+ " of nodes in the list");
					return;
				}
				refEntity = refEntity.next;
				counter++;
			}

			while (refEntity != null) {
				mainEntity = mainEntity.next;
				refEntity = refEntity.next;
			}
			System.out.println("Node no. " + nthNode + " from last is "
					+ mainEntity.data);
		}
	}
}
