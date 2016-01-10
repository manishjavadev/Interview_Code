package com.manish.javadev.basic;
import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program simply taking a sum of entered number 
 * 
 */
public class SumOfGivenNumber {
	
	public static void main(String[] args) {
		int number = 0;
		int numberTest = 0;
		int sumofNumber = 0;
		int rem = 0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		numberTest = number;
		while (numberTest > 0) {
			rem = numberTest % 10;
			sumofNumber = sumofNumber + rem;// here we are making cube of number and
			numberTest = numberTest / 10;// adding it			
		}
		System.out.println("This is entered number "+number);
		System.out.println("Some of entered number is "+sumofNumber);
		System.out.println("Done");
		
	}
}
