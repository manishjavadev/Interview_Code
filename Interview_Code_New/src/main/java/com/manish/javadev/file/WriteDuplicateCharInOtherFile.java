package com.manish.javadev.file;

import java.io.*;

/**
 * @author Manish 
 * 
 */
/**
 * This program reading a line form file and storing duplicate char in other
 * file
 * 
 */
public class WriteDuplicateCharInOtherFile {

	public static void main(String[] args) throws IOException {
		File f1 = new File("abc.txt");
		File f2 = new File("abc1.txt");
		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);
		char[] ch = new char[(int) f1.length()];

		// Here FileReader reading a line and storing in char array
		fr.read(ch);
		char ch1, ch2;
		for (int i = 0; i < ch.length; i++) {
			ch1 = ch[i];

			boolean flag = false;
			for (int j = i + 1; j < ch.length; j++) {
				ch2 = ch[j];
				if (ch1 == ch2) {
					ch[j] = ' ';
					// Here i m writing duplicate char in other file
					// With the help of file Writer
					fw.write(ch2);
					flag = true;
					System.out.println("Hello");
				}
			}
			if (flag)
				fw.write(ch1);
			fw.write("\n");
		}
		fw.flush();
		fw.close();
	}
}
