package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program convert Decimal number to binary number
 * 
 */
public class ConvertDecimalToBinary {

	public static void main(String[] args) {

		int num;
		int enteredNumber;
		int rem;
		int rule = 1;
		int binaryNumber = 0;

		System.out.println("Enter the Decimal number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		enteredNumber = num;
		while (num > 0) {
			rem = num % 2;
			binaryNumber = binaryNumber + rem * rule;
			rule = rule * 10;
			num = num / 2;
		}

		System.out.println("Binary number of " + enteredNumber + " is "
				+ binaryNumber);
		System.out.println("Done");
	}

}
