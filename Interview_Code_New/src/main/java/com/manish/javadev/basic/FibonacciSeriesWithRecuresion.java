package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program printing FibonacciSeries using Recuresion till entered number
 * For more detail lease visit Wiki page https://en.wikipedia.org/wiki/Fibonacci_number
 */
public class FibonacciSeriesWithRecuresion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		for (int i = 0; i <= number; i++) {
			int result = createFibonaccki(i);
			System.out.println(result);
		}
	}

	private static int createFibonaccki(int n) {
		if (n == 0 || n == 1)
			return 1;
		else {
			return (createFibonaccki(n - 1) + createFibonaccki(n - 2));
		}
	}
}