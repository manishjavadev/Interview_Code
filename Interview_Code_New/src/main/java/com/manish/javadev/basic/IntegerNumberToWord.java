package com.manish.javadev.basic;
import java.util.Scanner;

/**
 * @author Manish
 *
 */
/**
 * This program is simply print entered number into word.
 *
 */
public class IntegerNumberToWord {
	
	public static void main(String[] args) {
		int number, temp, r = 0, reverseNumber = 0;
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		number = Integer.parseInt(sc.next());
		temp = number;
		
		while (temp > 0) {
			r = temp % 10;
			//First I am reverse the number
			//Then again apply reminder technique and printing this.
			reverseNumber = reverseNumber * 10 + r;
			temp = temp / 10;

		}
		while (reverseNumber > 0) {
			int reverseNumber1 = reverseNumber % 10;
			switch (reverseNumber1) {
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			case 4:
				System.out.println("FOURE");
				break;
			case 5:
				System.out.println("FIVE");
				break;
			case 6:
				System.out.println("SIX");
				break;
			case 7:
				System.out.println("SEVEN");
				break;
			case 8:
				System.out.println("EIGHT");
				break;
			case 9:
				System.out.println("NINE");
				break;
			case 0:
				System.out.println("ZERO");
				break;

			default:
				break;
			}
			reverseNumber = reverseNumber / 10;
		}
		System.out.println("done");
	}

}
