package com.manish.javadev.tdd;

/**
 * @author Manish
 *
 */
/**
 * This program find biggest and smallest number in array
 * 
 */
public class FindMinMaxInArray {

	public static void main(String[] args) {

		int arr[] = { 10, 3, 5, 4, 57, 1, 9 };
		int maxNumber = arr[0];
		int minNumber = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNumber) {
				maxNumber = arr[i];
			}
			if (arr[i] < minNumber) {
				minNumber = arr[i];
			}
		}

		System.out.println("Biggest Number = " + maxNumber
				+ "\nAnd Smallest Number = " + minNumber);
		System.out.println("Done");
	}

}
