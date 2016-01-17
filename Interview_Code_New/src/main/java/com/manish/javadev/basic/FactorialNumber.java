package com.manish.javadev.basic;

import java.util.Scanner;

/**
 * @author Manish
 *
 */
/**
 * This program is simply printing the factorial number WithRecursion of entered number
 *
 */
public class FactorialNumber {
	
	static int factNumber = 1;
	static int numberTest = 0;

	public static void main(String[] args) {
		int number = 0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		numberTest = number;
		int result= factorilaNumber(number);
		System.out.println("Result Fact = "+ result);
	}

	// factorilaNumber With Recursion 
	private static int factorilaNumber(int number) {
		if(number==0){
			return 1;
		}
		else{
			return(number*factorilaNumber(number-1));
		}
		
	}
	
	// factorilaNumber With Non Recursion 
	/*private static int factorilaNumber(int number) {
		if (number== 0){
			return 1;
		}
		else {
			while (number > 1) {
				factNumber = factNumber * number;
				number--;
			}
			return factNumber;
		}
	}*/
}