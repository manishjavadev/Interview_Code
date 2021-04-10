package com.manish.javadev.string;

/**
 * 
 * @author Manish Srivastava
 *
 */
public class ReverseWordWithoutSpecialCahar {
	public static void main(String[] args) {
		// String str = "#Manish#$Kumar#$";
		String str = "A,B.C";
		char[] ch = str.toCharArray();

		System.out.println("Input string: " + str);
		reverse1(ch, 0, ch.length - 1);

		String resultStr = new String(ch);
		System.out.println("Output string: " + resultStr);
	}

	public static void reverse(char str[], int low, int high) {
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

	static void reverse1(char[] ch, int low, int high) {
		if (low < high) {
			if (!Character.isAlphabetic(ch[low])) {
				low++;
			}
			if (!Character.isAlphabetic(ch[high])) {
				high--;
			}
			swapData(ch, low, high);
			reverse1(ch, low + 1, high - 1);
		}
	}

	private static void swapData(char[] str, int low, int high) {
		char tmp = str[low];
		str[low] = str[high];
		str[high] = tmp;
	}
}
