package com.manish.javadev.geeks.basics;

/**
 * http://www.geeksforgeeks.org/find-next-greater-number-set-digits/
 * 
 * 
 * Following are few observations about the next greater number.
 * 
 * 1) If all digits sorted in descending order, then output is always Not
 * Possible. For example, 4321.
 * 
 * 2) If all digits are sorted in ascending order, then we need to swap last two
 * digits. For example, 1234 and then output 1243
 * 
 * 3) For other cases, we need to traverse the array number from rightmost side
 * (why? because we need to find the smallest of all greater numbers)
 * 
 * Following is the algorithm for finding the next greater number.
 * 
 * I) Traverse the given number from rightmost digit, keep traversing till you
 * find a digit which is smaller than the previously traversed digit. For
 * example: if the input number is 534976, we stop at 4 because 4 is smaller
 * than next digit 9. If we do not find such a digit, then output is Not
 * Possible
 * 
 * II) Now search the right side of above found digit for the smallest digit
 * greater than. For 534976, the right side of 4 contains 976. The smallest
 * digit greater than 4 is 6.
 * 
 * III) Swap the above found two digits, we get 536974 in above example.
 * 
 * IV) Now sort all digits from position next to the end of number. The number
 * that we get after sorting is the output. For above example, we sort digits in
 * bold 536974. We get 536479 which is the next greater number for input 534976.
 * 
 * 
 * =========== Next Explanation from Stack Overflow==============
 * 123456784987654321 start with a number
 * 
 * 123456784 987654321 ^the first place from the right where the left-digit is
 * less than the right Digit "x" is 4
 * 
 * 123456784 987654321 ^find the smallest digit larger than 4 to the right
 * 
 * 123456785 4 98764321 ^place it to the left of 4
 * 
 * 123456785 4 12346789 123456785123446789 ^sort the digits to the right of 5.
 * Since all of them except the '4' were already in descending order, all we
 * need to do is reverse their order, and find the correct place for the '4'
 * 
 * @author m.d.srivastava
 * 
 */

public class FindNextGreaterNumberWithSameDigit {
	// String number = "534976";
	String number = "424976";
	char[] digits = number.toCharArray();

	public static void main(String[] args) {

		FindNextGreaterNumberWithSameDigit findGreaterNumber = new FindNextGreaterNumberWithSameDigit();
		findGreaterNumber.findNextNumber(findGreaterNumber.digits);

	}

	private void findNextNumber(char[] number) {
		int currIndex, j = 0;
		for (currIndex = number.length - 1; currIndex > 0; currIndex--) {
			if (number[currIndex] > number[currIndex - 1])
				break;
		}

		if (currIndex == 0) {
			System.out.println("Next number is not possible");
			return;
		}

		char flNumber = number[currIndex - 1];
		int fgIndex = currIndex;
		for (j = currIndex; j < number.length; j++) {
			if (number[j] > flNumber && number[j] < number[fgIndex])
				fgIndex = j;
		}

		swap(digits, currIndex - 1, fgIndex);
		sort(digits, currIndex);
		for (int k = 0; k < digits.length; k++) {
			System.out.print(digits[k] + "\t");
		}

	}

	private void sort(char[] arr, int i) {
		for (int j = i; j < arr.length - 1; j++) {
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[j] > arr[k]) {
					char temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
	}

	private void swap(char[] digits2, int i, int smallest) {
		char temp = digits2[i];
		digits2[i] = digits2[smallest];
		digits2[smallest] = temp;
	}
}
