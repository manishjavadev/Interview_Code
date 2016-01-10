package com.manish.javadev.basic;
import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program Simply reversing the String 
 * 
 */
public class ReverseIntegerNumber {

	public static void main(String[] args) {
		int num;
		int rem;
		int enteredNumber;
		int revNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide input number");
		num = Integer.parseInt(sc.next());
		//Here we are storing in entered number in variable because of displaying
		
		enteredNumber=num;		
		while (num > 0) {
			rem = num % 10;	//Here we are getting last digit of number
			revNum = revNum * 10 + rem;	//Here we are reversing the number
			num = num / 10;
		}
		System.out.println("This is entered number "+enteredNumber);
		System.out.println("This is reversed number "+revNum);
		System.out.println("Done");
	}
}

