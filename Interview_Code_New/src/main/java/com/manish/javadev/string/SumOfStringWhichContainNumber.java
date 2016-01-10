package com.manish.javadev.string;

import java.util.StringTokenizer;

/**
 * @author Manish
 *
 */
/**
 * This program taking a sum of String if string contain number with space
 *
 */
public class SumOfStringWhichContainNumber {
	
	public static void main(String[] args) {
		String str="20.2 20 40";
		double sum=0;
		//StringTokenizer is class which taking two argument
		//one is string it self and other is delimiter
		StringTokenizer str1 = new StringTokenizer(str, " ");
		while (str1.hasMoreTokens()) {
			sum=sum+Double.parseDouble(str1.nextToken());			
		}
		System.out.println("Sum of String is this  "+sum);
	}	
}
