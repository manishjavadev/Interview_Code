package com.manish.javadev.string;

import java.util.Scanner;

/**
 * @author Manish
 *
 */
/**
 * This program simply adding two String 
 *
 */
public class ConcatinateTwoString {
	static String finalString;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String fName = sc.next();
		System.out.println("Enter your sir name");
		String sirName = sc.next();
		//Here i am trying to add two String
		finalString = fName + sirName;
		System.out.println("Your full name is\t" + finalString);
	}

}
