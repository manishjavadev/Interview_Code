package com.manish.javadev.geeks.linkedlist;

public class IntersectionOfLinkedList {
	Entity front1, back1, front2, back2;

	public static void main(String[] args) {
		IntersectionOfLinkedList ml = new IntersectionOfLinkedList();
		// Here I am adding object to linked list

		ml.list2("888");
		ml.list2("999");
		ml.list2("000");

		ml.list1("111");
		ml.list1("222");
		ml.list1("333");
		ml.list1("444");
		ml.back2 = ml.back1;
		ml.list1("555");
		ml.list1("666");

		Entity ent = getIntersectionNode(ml.front1, ml.front2);

	}

	private static Entity getIntersectionNode(Entity front12, Entity front22) {
		int counter1 = 0;
		int counter2 = 0;
		int counter=0;
		while (front12.next != null) {
			counter1++;
		}
		while (front12.next != null) {
			counter2++;
		}
		if (counter1 < counter2) {
			
		}

		return null;
	}

	public void list1(Object obj) {

		Entity e = new Entity();
		e.data = obj;
		if (front1 == null) {
			front1 = e;
		} else {
			back1.next = e;
		}
		back1 = e;
	}

	public void list2(Object obj) {

		Entity e = new Entity();
		e.data = obj;
		if (front2 == null) {
			front2 = e;
		} else {
			back2.next = e;
		}
		back2 = e;
	}

}
