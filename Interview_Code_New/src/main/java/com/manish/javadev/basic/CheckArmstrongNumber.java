package com.manish.javadev.basic;
import java.util.Scanner;

/**
 * @author Manish
 * 
 */

/**
 * ArmstrongNumber means cube of each digit sum of number is equal to again
 * number for ex 153 like (3*3*3)+(5*5*5)+(1*1*1) if this sum equal to number means
 * 153 then its ArmstrongNumber Number
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
		while (numberTest > 0) {
			rem = numberTest % 10;
			sum = sum + rem * rem * rem;// here we are making cube of number and
										// adding it
			numberTest = numberTest / 10;
		}
		if (number == sum)
			System.out.println("Entered number "+number+ " is ArmstrongNumber");
		else {
			System.out.println("Entered number is not ArmstrongNumber");
		}
	}

}
