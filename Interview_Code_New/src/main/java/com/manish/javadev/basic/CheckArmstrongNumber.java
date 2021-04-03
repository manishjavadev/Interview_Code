package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 * 
 */

/**
 * Armstrong number is a number which is equal to sum of digits raise to the
 * power total number of digits in the number. 
 * 7 = 7^1
 * 371 = 3^3 + 7^3 + 1^3 (27 + 343 +1) 
 * 8208 = 8^4 + 2^4 +0^4 + 8^4 (4096 + 16 + 0 + 4096). 
 * 1741725 = 1^7 + 7^7 + 4^7 + 1^7 + 7^7 + 2^7 +5^7 (1 + 823543 + 16384 + 1 + 823543 +128 + 78125)
 * 
 */
public class CheckArmstrongNumber {

	public static void main(String[] args) {
		int number = 0;
		int numberTest = 0;
		int sum = 0;
		int rem = 0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		numberTest = number;
		
		int power = getNumberOfDigit(number);
		
		while (numberTest > 0) {
			rem = numberTest % 10;
			sum += getPowerSum(rem, power);// here we are making power of digit
			numberTest = numberTest / 10;
		}
		
		if (number == sum)
			System.out.println("Entered number " + number
					+ " is ArmstrongNumber");
		else {
			System.out.println("Entered number is not ArmstrongNumber");
		}
	}

	private static int getPowerSum(int rem, int power) {
		int digit = 1;

		for (int i = 0; i < power; i++) {
			digit = digit * rem;
		}
		return digit;
	}

	private static int getNumberOfDigit(int number) {
		int cnt = 0;
		while (number > 0) {
			cnt++;
			number = number / 10;
		}
		return cnt;
	}

}
