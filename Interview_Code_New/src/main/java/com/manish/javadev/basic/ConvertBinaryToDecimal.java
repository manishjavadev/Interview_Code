package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program convert binary number to decimal number
 * 
 */
public class ConvertBinaryToDecimal {

	public static void main(String[] args) {

		int num;
		int enteredNumber;
		int rem;
		int decRule = 1;
		int decimalNumber = 0;

		System.out.println("Enter the number in binary");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		enteredNumber = num;
		while (num > 0) {
			rem = num % 10;
			decimalNumber = decimalNumber + rem * decRule;
			decRule = decRule * 2;
			num = num / 10;
		}

		System.out.println("Decimal number of " + enteredNumber + " is "
				+ decimalNumber);
		System.out.println("Done");
	}

}
