package com.manish.javadev.basic;

/**
 * @author Manish
 *
 */
/**
 * This program simply finding the greatest number between  three number
 *
 */
public class GreatestNumberBetweenThreeNumber {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 4;
		int large = 0;
		//First check a is greater than b and a is greater than c
		if (a > b) {
			if (a > c)
				large = a;
			else
				large = c;
		}
		//Here we are checking b is greater than c
		else {
			if (b > c)
				large = b;
			else
				large = c;
		}
		System.out.println("a= "+a+", b= "+b+", c= "+c);
		System.out.println("largest value is "+large);
	
	}
}
