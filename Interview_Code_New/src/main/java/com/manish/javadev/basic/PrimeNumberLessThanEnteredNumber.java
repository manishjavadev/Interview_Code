package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 *
 */
/**
 * http://www.geeksforgeeks.org/primality-test-set-1-introduction-and-school-
 * method/ This program simply printing prime number less than entered number
 * 
 * 
 * @author m.d.srivastava
 * 
 */
public class PrimeNumberLessThanEnteredNumber {

	public static void main(String[] args) {
		int number = 0;
		int start = 1;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		// IN side while we are calling a function which will check for prime
		// prime logic is in method what i am calling from here
		while (start <= number) {
			if (isPrime(start))// calling is prime function
				System.out.print(start + " ,");
			start++;
		}
	}

	// This is logic for prime number debug the program and try to understand
	// it.
	// If flag returning true then number is prime other wise non prime.
	private static boolean isPrime(int number) {// is Prime is there
		boolean flag = false;
		// Corner case
		if (number <= 1)
			return flag;
		for (int index = 2; index < number; index++)
			if (number % index == 0)
				return false;
		return true;
	}
}
