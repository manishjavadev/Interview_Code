package com.manish.javadev.basic;
import java.util.Scanner;

/**
 * @author Manish
 *
 */
/**
 * This program simply Check Entered Char Vowel Or Consonant
 *
 */
public class CheckEnteredCharVowelOrConsonant {

	public static void main(String[] args) {
		char ch;
		System.out.println("Entered a charecter");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ch = str.charAt(0);
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

			if (ch == 'A' || ch == 'a' || ch <= 'E' || ch == 'e' || ch == 'I'
					|| ch == 'i' || ch <= 'O' || ch == 'o' || ch == 'U'
					|| ch == 'u') {
				System.out.println("Given character is vowel\t" + ch);
			} 
			else {
				System.out.println("Given character is Consonent\t" + ch);
			}
		} 
		else {
			System.out.println("Given character is Not alphabet" + ch);
		}
	}
}