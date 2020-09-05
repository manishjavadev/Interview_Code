package com.manish.javadev.geeks.array;

/**
 * Display Number to Word
 * 
 * Input 1217810
 * 
 * Output: twelve lakh seventeen thousand eight hundred ten
 * 
 * @author kmamani
 *
 */
public class DisplayNumberToWrod {
	String one[] = { " ", " one", " two", " three", " four", " five", " six", " seven", " eight", " Nine", " ten",
			" eleven", " twelve", " thirteen", " fourteen", "fifteen", " sixteen", " seventeen", " eighteen",
			" nineteen" };
	String ten[] = { " ", " ", " twenty", " thirty", " forty", " fifty", " sixty", "seventy", " eighty", " ninety" };

	public void numberToWord(int n, String displayStr) {
		if (n > 19) {
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		} else {
			System.out.print(one[n]);
		}
		if (n > 0)
			System.out.print(displayStr);
	}

	public static void main(String[] args) {
		int num = 1217810;
		if (num <= 0)
			System.out.println("Enter numbers should be greater than 0");
		else {
			DisplayNumberToWrod dntw = new DisplayNumberToWrod();
			dntw.numberToWord((num / 10000000) % 100, " crore");
			dntw.numberToWord(((num / 100000) % 100), " lakh");
			dntw.numberToWord(((num / 1000) % 100), " thousand");
			dntw.numberToWord(((num / 100) % 10), " hundred");
			dntw.numberToWord((num % 100), " ");
		}
	}
}