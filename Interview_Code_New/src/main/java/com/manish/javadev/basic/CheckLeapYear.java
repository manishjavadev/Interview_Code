package com.manish.javadev.basic;
import java.util.Scanner;

/**
 * @author Manish
 *
 */
/**
 * THis program simply checking entered year is leap year or not
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
			} 
			else {
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
