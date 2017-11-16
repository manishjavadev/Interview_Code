package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * 
 * 				= 1 n=0
 * 
 * fact(n) =
 * 
 * 				n*fact(n-1) n>0
 * 
 * This program is simply printing the factorial number WithRecursion of entered
 * number
 * 
 * 
 * @author m.d.srivastava
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
		int result = fact(number);
		System.out.println("Result Fact = " + result);
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