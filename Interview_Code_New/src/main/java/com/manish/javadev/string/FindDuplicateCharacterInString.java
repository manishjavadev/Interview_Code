package com.manish.javadev.string;

import java.util.ArrayList;

/**
 * @author Manish
 *
 */
/**
 * This program finding duplicate char in string, and also printing the
 * Occurrence of duplicate char, and also counting how many char repeated Note:
 * dopCounter is variable which count how many char is repeated Best way to
 * understand start debugging the code =============================== output
 * 
 * like that for this String str = "abccdeefffffffghhhhkkk";
 * 
 * Print char occurs how many time and char it self c Occurs 2 time cc e Occurs
 * 2 time ee f Occurs 7 time fffffff h Occurs 4 time hhhh k Occurs 3 time kkk
 * Total repeated char in string 5
 * 
 */
public class FindDuplicateCharacterInString {
	char ch;

	public static void main(String[] args) {
		// Here i am creating the object of FindDuplicateCharacterInString
		// and calling the method findDuplicateAndDisplayCounter
		FindDuplicateCharacterInString findDuplicate = new FindDuplicateCharacterInString();
		findDuplicate.findDuplicateAndDisplayCounter();

	}

	public void findDuplicateAndDisplayCounter() {
		String str = "abccdeefffffffghhhhkkk";
		char[] strArray = str.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		int counter = 0;
		int dopCounter = 0;
		System.out.println("Print char coours how many time and char it self ");
		for (int i = 0; i < strArray.length; i++) {
			boolean repeate = false;
			counter = 0;
			// In this for loop find duplicate char logic is there
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					repeate = true;
					ch = strArray[i];
					counter++;
				}
			}
			// Here we are trying to print the entire logic for code
			// If list.contains is false then it will print the logic try to
			// understand
			if (repeate && counter > 0 && !list.contains(ch)) {

				System.out.print(ch + " Occurs " + (counter + 1) + " time ");
				for (int j = 0; j <= counter; j++) {
					System.out.print(ch);
				}
				System.out.print("\n");
				dopCounter++;
			}
			list.add(strArray[i]);
		}
		System.out.println("Total repeted char in string " + dopCounter);
	}
}