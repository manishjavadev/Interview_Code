package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program printing FibonacciSeries using Recuresion till entered number
 * For more detail lease visit Wiki page
 * https://en.wikipedia.org/wiki/Fibonacci_number Sample FibonacciSeries like
 * this (1 1 2 3 5 8)
 * 			
 * 				1 								n=0 or n=1  
 * 			
 * fib(n) = 
 * 
 * 				fib(n-1) + fib(b-2) 	n>1
 */
public class FibonacciSeriesWithRecuresion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			int result = fib(i);
			System.out.print(result + "\t");
		}
	}

	private static int fib(int n) {
		if (n == 0 || n == 1)
			return 1;
		else {
			return (fib(n - 1) + fib(n - 2));
		}
	}
}