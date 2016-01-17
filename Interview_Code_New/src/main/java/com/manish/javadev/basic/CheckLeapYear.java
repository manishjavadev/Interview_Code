package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 *
 */
/**
 * This program simply checking entered year is leap year or not.
 * A leap year is a year containing an extra days. 
 * It has 366 days instead of 365 days The extra days added in February
 * which is of 29 days instead of 28 days.
 * A leap year occurs in every 4 years for
 * ex 2008 is leap year so next leap year will be 2012 
 * Except that every 100 year for 100 year special rule will apply
 * 
 */
public class CheckLeapYear {

	public static void main(String[] args) {
		int year = 0;
		System.out.println("Enter a year for checking leap year");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if (year % 100 == 0)
			if (year % 400 == 0) {
				System.out.println(year + " is leap year");
			} else {
				System.out.println(year + " is not a leap year");
			}
		else {
			if (year % 4 == 0)
				System.out.println(year + " is leap year");
			else {
				System.out.println(year + " is not a leap year");
			}
		}
	}

}
