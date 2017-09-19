package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program printing Power Of Number using Recuresion till entered number
 * Power Of number
 * 
 * 			= 1 n=0 
 * a^n = 
 * 			a*power(a,n-1) n>1
 */
public class PowerWithRecuresion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		System.out.println("Enter Power");
		int power = sc.nextInt();
		int result = power(number, power);
		System.out.println("Number " + number + "  with power  " + power
				+ "  is " + result);
	}

	private static int power(int number, int power) {
		if (power == 0) {
			return 1;
		} else {
			return (number * power(number, (power - 1)));
		}
	}

}