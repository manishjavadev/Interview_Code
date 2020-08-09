package com.manish.javadev.array;

import java.util.Arrays;

/**
 * @author Manish
 *
 */

/**
 * This program sorting string of array in acceding order
 * 
 */
public class SortStringOfArray {
	public static void main(String[] args) {
		String[] myArray = { "BB", "HH", "AA", "JJ", "NN", "MM" };
		int size = myArray.length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i].compareTo(myArray[j]) > 0) {
					String temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(myArray));
		System.out.println("\nDone");
	}
}
