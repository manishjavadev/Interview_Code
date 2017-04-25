package com.manish.javadev.geeks.array;

import java.util.Scanner;

public class DisplayNumberToWrod {
	String one[] = { " ", " one", " two", " three", " four", " five", " six",
			" seven", " eight", " Nine", " ten", " eleven", " twelve",
			" thirteen", " fourteen", "fifteen", " sixteen", " seventeen",
			" eighteen", " nineteen" };
	String ten[] = { " ", " ", " twenty", " thirty", " forty", " fifty",
			" sixty", "seventy", " eighty", " ninety" };

	public void power(int n, String ch) {
		if (n > 19) {
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		} else {
			System.out.print(one[n]);
		}
		if (n > 0)
			System.out.print(ch);
	}

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		n = sc.nextInt();
		if (n <= 0)
			System.out.println("Enter numbers should be greater than 0");
		else {
			DisplayNumberToWrod dntw = new DisplayNumberToWrod();
			dntw.power((n / 10000000) % 100, " crore");
			dntw.power(((n / 100000) % 100), " lakh");
			dntw.power(((n / 1000) % 100), " thousand");
			dntw.power(((n / 100) % 10), " hundred");
			dntw.power((n % 100), " ");
		}
	}
}