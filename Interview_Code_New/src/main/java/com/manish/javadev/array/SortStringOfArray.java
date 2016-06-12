package com.manish.javadev.array;

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
		String str[] = { "Manish", "Ashish", "Ravi", "Java", "Technology" };
		String temp = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length-1; j++) {
				// If you want to sort in descending order then change the symbol
				// to >(greater than) like if ((str[j].compareTo(str[i]) >0)) {
				if ((str[i].compareTo(str[j]) > 0)) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println("\nDone");
	}
}
