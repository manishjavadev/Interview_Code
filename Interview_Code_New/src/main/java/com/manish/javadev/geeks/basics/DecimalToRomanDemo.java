package com.manish.javadev.geeks.basics;

import java.util.HashMap;

/**
 * 1 - i, 9 - IX, 100 - c, 4 - iv, 10 - X, 500 - d, 5 - v, 50 - I, 1000 - m
 * 
 * @author Manish Srivastava
 * 
 */
public class DecimalToRomanDemo {
	private static int[] bases = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private static HashMap<Integer, String> map = new HashMap<Integer, String>();

	public static void main(String arg[]) {
		initializeMap();
		DecimalToRomanDemo decimalToRomanDemo = new DecimalToRomanDemo();
		int num = 149;
		String result = decimalToRomanDemo.decimalToRoman(num);
		System.out.println("Entered Number " + num + "\nEquivalent roman number " + result);
	}

	public String decimalToRoman(int num) {
		String result = new String();
		for (int baseData : bases) {
			while (num >= baseData) {
				result = result + map.get(baseData);
				num = num - baseData;
			}
		}
		return result;
	}

	private static void initializeMap() {
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");
	}
}
