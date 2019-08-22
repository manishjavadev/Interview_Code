package com.manish.javadev.geeks.array.rearrange;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

/**
 * Given an array of numbers, arrange them in a way that yields the largest
 * value. For example, if the given numbers are {54, 546, 548, 60}, the
 * arrangement 6054854654 gives the largest value. And if the given numbers are
 * {1, 34, 3, 98, 9, 76, 45, 4}, then the arrangement 998764543431 gives the
 * largest value.
 * 
 * A simple solution that comes to our mind is to sort all numbers in descending
 * order, but simply sorting doesn’t work. For example, 548 is greater than 60,
 * but in output 60 comes before 548. As a second example, 98 is greater than 9,
 * but 9 comes before 98 in output.
 * 
 * So how do we go about it? The idea is to use any comparison based sorting
 * algorithm. In the used sorting algorithm, instead of using the default
 * comparison, write a comparison function myCompare() and use it to sort
 * numbers. Given two numbers X and Y, how should myCompare() decide which
 * number to put first – we compare two numbers XY (Y appended at the end of X)
 * and YX (X appended at the end of Y). If XY is larger, then X should come
 * before Y in output, else Y should come before. For example, let X and Y be
 * 542 and 60. To compare X and Y, we compare 54260 and 60542. Since 60542 is
 * greater than 54260, we put Y first.
 * 
 * Following is the implementation of the above approach. To keep the code
 * simple, numbers are considered as strings, and vector is used instead of
 * normal array.
 * 
 * 54 Y 546 X | Y 548 X | Y 60 X
 * 
 * @author kmamani
 *
 */
public class ArrangeGivenNumbersFormBiggestNumber {
	// The main function that prints the
	// arrangement with the largest value.
	// The function accepts a vector of strings
	static void printLargest(Vector<String> arr) {

		Collections.sort(arr, new Comparator<String>() {
			// A comparison function which is used by
			// sort() in printLargest()
			@Override
			public int compare(String X, String Y) {

				// first append Y at the end of X
				String XY = X + Y;

				// then append X at the end of Y
				String YX = Y + X;
				int result = "200999".compareTo("20");

				// Now see which of the two formed numbers
				// is greater
				
				/**
				 * If  XY.compareTo(YX) return -1: XY placed before YX
				 *  If  XY.compareTo(YX) return 1: XY placed After YX
				 */
				result = XY.compareTo(YX) > 0 ? -1 : 1;
				return result;
			}
		});

		Iterator it = arr.iterator();

		while (it.hasNext())
			System.out.print(it.next());

	}

	// driver program
	public static void main(String[] args) {

		Vector<String> arr;
		arr = new Vector<>();

		// output should be 6054854654
		arr.add("60");
		arr.add("240");
		arr.add("30");
		// arr.add("548");
		// arr.add("60");
		printLargest(arr);

		// output should be 777776
		/*
		 * arr.add("7"); arr.add("776"); arr.add("7"); arr.add("7");
		 */

		// output should be 998764543431
		/*
		 * arr.add("1"); arr.add("34"); arr.add("3"); arr.add("98");
		 * arr.add("9"); arr.add("76"); arr.add("45"); arr.add("4");
		 */
	}
}
