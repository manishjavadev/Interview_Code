package com.manish.javadev.pyramid;

public class Pyramid3P {
	public static void main(String[] args) {
		int n = 5;
		int j = 0;
		for (int i = 1; i <= n; i++) {
			for (j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// 2nd for loop increasing number and displaying it
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}
}
