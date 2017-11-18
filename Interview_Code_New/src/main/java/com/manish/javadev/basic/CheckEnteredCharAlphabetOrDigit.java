package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program simply checking entered char is alpha bet or digit Or special
 * char
 * 
 */
public class CheckEnteredCharAlphabetOrDigit {

	public static void main(String[] args) {
		char ch;
		System.out.println("Entered a charecter");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ch = str.charAt(0);
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			System.out.println("Given character is alphabet\t" + ch);
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("Given character is digit\t" + ch);
		} else {
			System.out.println("Given character is special character\t" + ch);
		}
		System.out.println("Done");
	}
}
