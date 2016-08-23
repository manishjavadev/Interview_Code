package com.manish.javadev.geeks.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author m.d.srivastava
 *
 */
public class RemoveDuplicatePrime {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 5, 7, 13, 11, 5, 13, 29, 13 };
		removeDups(arr);

	}

	private static void removeDups(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}
 } 