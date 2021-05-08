package com.manish.javadev.interview;

import java.util.ArrayList;
import java.util.Hashtable;

public class RetainAllDemo {
	public static void main(String[] args) {

		
		
		Hashtable<String,String> hashtable  = new Hashtable<String, String>();
		hashtable.put(null, "Manish");

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		// list1.remove("30");

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(10);
		// list1.retainAll(list2);
		list1.remove(2);
		System.out.println("List1 :: " + list1);
		System.out.println("List2 :: " + list2);
	}

}
