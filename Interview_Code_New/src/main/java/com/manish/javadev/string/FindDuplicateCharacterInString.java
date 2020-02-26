package com.manish.javadev.string;

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
		int counter = 0;
		System.out.println("Print char coours how many time and char it self ");

		char tmp = ' ';
		for (int i = 0; i < strArray.length; i++) {
			if (counter == 0) {
				tmp = strArray[i];
			}
			if (tmp == strArray[i]) {
				counter += 1;
			} else {
				if (counter > 1) {
					System.out.println(strArray[i - 1] + " Occurs " + (counter) + " time ");
				}
				tmp = strArray[i];
				counter = 1;
			}
			if (i == strArray.length - 1) {
				if (counter > 1) {
					System.out.println(strArray[strArray.length - 1] + " Occurs " + (counter) + " time ");
				}
			}
		}
	}
}