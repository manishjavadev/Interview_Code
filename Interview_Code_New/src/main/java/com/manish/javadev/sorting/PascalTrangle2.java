package com.manish.javadev.sorting;

import java.util.Scanner;

/**
 * @author Manish
 * 
 */
public class PascalTrangle2 {
	public static void main(String[] args) {
		System.out.println("Enter number of  rows for pascal trangle");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		for (int i = 0; i < number; i++) {
			int no = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(no + " ");
				no = no * (i - j) / (j + 1);
			}
			System.out.println("");
		}
	}
}
