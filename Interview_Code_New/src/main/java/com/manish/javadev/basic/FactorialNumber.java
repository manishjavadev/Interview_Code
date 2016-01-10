package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 *
 */
/**
 * This program is simply printing the factorial number of entered number
 *
 */
public class FactorialNumber {
	
	static int factNumber = 1;
	static int numberTest = 0;

	public static void main(String[] args) {
		int number = 0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		numberTest = number;
		factorilaNumber(number);
	}

	private static void factorilaNumber(int number) {
		if (number < 0)
			System.out.println("No factorial number of given number");
		else {
			while (number > 1) {
				factNumber = factNumber * number;
				number--;
			}
			System.out.println("Factorial of "+ numberTest+ " is "+ factNumber);
		}
	}
}
