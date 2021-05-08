package com.manish.javadev.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * http://www.geeksforgeeks.org/primality-test-set-1-introduction-and-school-method/
 * 
 * 
 * 
 * What are Prime Numbers?
 * 
 * ======================
 * 
 * In math, prime numbers are whole numbers greater than 1, that have only two
 * factors – 1 and the number itself. Prime numbers are divisible only by the
 * number 1 or itself.
 * 
 * For example, 2, 3, 5, 7 and 11 are the first few prime numbers. To check if a
 * number is prime or not, the naive way is to try dividing the number by 2 thru
 * n, and if any operation gets remainder as 0, then we say the given number is
 * not prime. But its optimal to divide and check only till n/2 (am aware much
 * better way is till sqrt(n) ),
 * 
 * I want to know the reason for skipping the second half. say if we need to
 * check number 11 is prime or not, 11/2 = 5. if we do 11/6 or 11/7 or 11/8 or
 * 11/9 or 11/10 in neither of these cases we get remainder as 0. So is the case
 * for any given number n. Is the reason for avoiding second half this? "if you
 * divide the given number by any number which is more than given number's half,
 * remainder will never be 0 Or in other words, none of the numbers which are
 * more than the given number's half can divide the given number"
 * 
 * 
 * Because, the smallest multiple that will not make it a prime is 2. If you
 * have checked all the numbers from 0 to n/2, what multiple is left that could
 * possibly work? If multiple by 2 is bigger than n, then a multiple of 3 or 4
 * etc will also be bigger than n. So the largest factor for any number N must
 * be <= N/2 So yes take N/2, and check all integers smaller or equal to N/2. So
 * for 11 you would check all integers smaller than 5.5, i.e. 1, 2, 3, 4 and 5.
 * 
 * @author m.d.srivastava
 *
 */

public class PrimeNumberLessThanEnteredNumber2 {

	public static void main(String[] args) {
		int start = 1;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		while (list.size() != number) {
			if (isPrimeDivideBy2(start)) {
				list.add(start);
			}
			start++;
		}
		System.out.println(list);

	}

	/**
	 * This is logic for prime number debug the program and try to understand it. If
	 * flag returning true then number is prime other wise non prime.
	 * 
	 * @param number
	 * @return
	 */

	private static boolean isPrimeDivideBy2(int number) {
		boolean flag = false;
		// Corner case
		if (number <= 1)
			return flag;
		for (int index = 2; index <= number / 2; index++)
			if (number % index == 0)
				return false;
		return true;
	}
}
