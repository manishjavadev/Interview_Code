package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 *
 */
/**
 * This program simply printing the image of entered number
 *
 */
public class ImageOfGivenNumber {
	
	public static void main(String[] args) {
		int number;
		int reminder;
		int enteredNumber;
		int imageNumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide input number");
		number = Integer.parseInt(sc.next());
		
		//Here we are storing in entered number because of displaying
		enteredNumber=number;		
		while (number > 0) {
			
			//Here we are getting last digit of number
			reminder = number % 10;	
			
			//Here we are reversing the number
			imageNumber = imageNumber * 10 + reminder;	
			number = number / 10;
			
		}
		
		//Note: You have image number so you can check for palindrome
		//if Entered number is equal to reverse number then its a palindrome number
		System.out.println("This is entered number "+enteredNumber);
		System.out.println("This is image number "+imageNumber);
		System.out.println("Done");
		
	}

}
