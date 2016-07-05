package com.manish.javadev.geeks.array;

import java.util.ArrayList;
import java.util.List;

public class FindFirstRepetingElement {
	int arr[] = { 10, 5, 3, 4, 3, 5, 6 };

	public static void main(String[] args) {
		FindFirstRepetingElement ffre = new FindFirstRepetingElement();
		ffre.findFirstrepeate();
		System.out.println("Done");
	}

	private void findFirstrepeate() {
		int index = -1;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (list.contains(arr[i])) {
				index = i;
			} else {
				list.add(arr[i]);
			}
		}
		if (index >= 0) {
			System.out.println(arr[index]);
		} else {
			System.out.println("Repeted elemenet is not there");
		}
	}

}
