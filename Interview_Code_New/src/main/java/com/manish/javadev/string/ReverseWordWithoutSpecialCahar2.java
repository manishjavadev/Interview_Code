package com.manish.javadev.string;

public class ReverseWordWithoutSpecialCahar2 {
	public static void main(String[] args) {
		String str = "Manish#$Srivastava#$";
		char[] ch = str.toCharArray();

		System.out.println("Input string: " + str);
		reverse(ch);
		String resultStr = new String(ch);
		System.out.println("Output string: " + resultStr);
	}

	public static void reverse(char str[]) {
		for (int low = 0, high = str.length - 1; low < high;) {
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
