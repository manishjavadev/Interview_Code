package com.manish.javadev.array;

/**
 * @author Manish
 * 
 */

/**
 * This program finding second highest number in array 
 * 
 */
public class SecondHighestNumberInArray {
	public static void main(String[] args) {
		int fmax = 0;
		int smax = 0;
		int arr[] = { 10, 3, 5, 7, 0, 9 };
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fmax) {
				smax = fmax;
				fmax = arr[i];
			}
			if (smax < arr[i] && fmax != arr[i]) {
				smax = arr[i];
			}
		}
		System.out.println("First max Number = "+fmax+"\nAnd Second max Number = "+smax);
		System.out.println("Done");
	}
}
