package com.manish.javadev.vmware.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindUniqueElementInArray {
	public static void main(String[] args) {
		FindUniqueElementInArray count = new FindUniqueElementInArray();
		int arr[] = { 2, 3, 3, 2, 5 };
		count.findCounts(arr);

		int arr1[] = { 1 };
		count.findCounts(arr1);

		int arr3[] = { 4, 1, 2, 1, 2 };
		count.findCounts(arr3);

	}

	private void findCounts(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = (arr[i] - 1) % 10;
			arr[index] = arr[index] + 10;
		}

		System.out.println("=====");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] / 10 == 1) {
				System.out.println(i + 1 + " Occour " + arr[i] / 10 + " times");
			}
		}
		System.out.println("=============");

	}
	private void findCounts1(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(list.contains(new Integer(arr[i]))){
				list.remove(new Integer(arr[i]));
			}else {
				list.add(new Integer(arr[i]));
				
			}
		}

	}
}
