package com.manish.javadev.string;

import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This logic is also work for reverse the string only you remove the
 * if condition and simply print the reverse string.
 *
 */
public class CheckStringIsPalindrome {
	
	public static void main(String[] args) {
		String enteredString="";
		String reverseString="";
		char chr[];
		
		System.out.println("Please enter String");
		Scanner sc= new Scanner(System.in);
		enteredString=sc.next();
		chr=enteredString.toCharArray();
		
		for (int i =chr.length-1; i >=0 ; i--) {
			reverseString=reverseString+enteredString.charAt(i);
		}
		
		if(enteredString.equals(reverseString))
			System.out.println("Entered string is palindrome");
		else
			System.out.println("Entered string is not a palindrome");
	}

}
