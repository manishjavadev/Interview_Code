package com.manish.javadev.string;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class ReverseWordWithoutSpecialCahar {
	public static void main(String[] args) {
		String str = "#Manish#$Kumar#$";
		char[] ch = str.toCharArray();

		System.out.println("Input string: " + str);
		reverse(ch, ch.length - 1, 0);
		String resultStr = new String(ch);
		System.out.println("Output string: " + resultStr);
	}

	public static void reverse(char str[], int high, int low) {
		while (low < high) {
			if (!Character.isAlphabetic(str[low]))
				low++;
			else if (!Character.isAlphabetic(str[high]))
				high--;
			else {
				swapData(str, low, high);
				low++;
				high--;
			}
		}
	}

	private static void swapData(char[] str, int low, int high) {
		char tmp = str[low];
		str[low] = str[high];
		str[high] = tmp;
	}
}
