package com.manish.javadev.sorting;

import java.util.Scanner;

/**
 * @author Manish
 * 
 *         This will calculate the permutations for
 * 
 *         P(n,r) = n! / (n - r)! and
 * 
 *         the combinations for C(n,r) = n! / r! (n - r)!.
 */
public class CalculatePermutations {
	public static void main(String[] args) {
		System.out.println("Enter number of  rows for pascal trangle");
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(combi(i, j));
			}
			System.out.println("");
		}
	}

	private static int combi(int n, int r) {
		int result = fact(n);
		int divideNumber = fact(r) * fact(n - r);
		return result / divideNumber;
	}

	// factorilaNumber With Recursion
	private static int fact(int number) {
		if (number == 0) {
			return 1;
		} else {
			return (number * fact(number - 1));
		}

	}

}
