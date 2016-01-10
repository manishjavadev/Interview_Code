package com.manish.javadev.basic;
import java.util.Scanner;

/**
 * @author Manish
 *
 */
/**
 * This program simply printing table of any given number
 *
 */
public class PrintTableOfAnyNumber {
	
	public static void main(String[] args) {
		int number = 0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		printTableOfEnteredNumber(number);
	}

	private static void printTableOfEnteredNumber(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + "*" + i + "= " + (number * i));
		}
	}
}
