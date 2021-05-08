package com.manish.javadev.tdd;

/**
 * @author Manish
 *
 */

/**
 * This program is very simple its calculating sum of array
 * 
 */
public class SumOfArrayElement {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 7, 9, 11 };
		int sumOfArray = 0;
		for (int i = 0; i < arr.length; i++) {
			sumOfArray = sumOfArray + arr[i];
		}
		System.out.println("Sum of array is " + sumOfArray);
		System.out.println("Done");
	}

}
