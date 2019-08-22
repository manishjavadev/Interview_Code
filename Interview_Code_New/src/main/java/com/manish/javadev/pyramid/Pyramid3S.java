package com.manish.javadev.pyramid;

public class Pyramid3S {
	public static void main(String[] args) {
		int n = 5;
		int data = 0;
		for (int i = 1; i <= n; i++) {
			// manage initialize with i means start with i value
			data = i;
			// 1st for loop managing space
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// 2nd for loop increasing number and displaying it
			for (int j = 1; j <= i; j++) {
				System.out.print(data++);
			}
			// 3rd for loop look very carefully which decreasing the number
			data = data - 1;
			for (int j = 1; j < i; j++) {
				System.out.print(--data);
			}
			System.out.println("");
		}
	}
}
