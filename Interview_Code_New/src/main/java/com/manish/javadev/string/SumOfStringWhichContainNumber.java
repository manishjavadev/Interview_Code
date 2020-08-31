package com.manish.javadev.string;

/**
 * This program taking a sum of String if string contain number with space
 *
 * @author Manish Srivastava
 */
public class SumOfStringWhichContainNumber {

	public static void main(String[] args) {
		String str = "20.2 20 40";
		double sum = 0;
		String[] arr = str.split(" ");
		for (String str1 : arr) {
			sum = sum + Double.parseDouble(str1);
		}
		System.out.println("Sum of String is this  " + sum);
	}
}
