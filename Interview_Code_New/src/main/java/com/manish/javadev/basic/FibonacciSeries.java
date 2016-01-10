package com.manish.javadev.basic;
import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program printing FibonacciSeries till entered number
 * 
 */
public class FibonacciSeries {
	
	public static void main(String[] args) {
		int start, end, sum;
		start = end = 1;
		int tillNumbre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entered the number till you want to print");
		tillNumbre = sc.nextInt();
		for (int i = 1; i <= tillNumbre; i++) {
			System.out.print(start + "\t");
			sum = start + end;
			start = end;
			end = sum;
		}
		System.out.println("\nDone");
	
	}
}
