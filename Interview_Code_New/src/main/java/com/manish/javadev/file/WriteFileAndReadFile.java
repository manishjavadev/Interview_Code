package com.manish.javadev.file;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author Manish
 *
 */
/**
 * This is simple program which is writing a file and reading a file See below
 * comment first part writing a file and second part reading file and printing
 * in command prompt.
 * 
 */
public class WriteFileAndReadFile {
	public static void main(String[] args) throws Exception {
		String inputFile = "abc.txt";
		File inputfile = new File(inputFile);
		FileOutputStream fos = new FileOutputStream(inputfile);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeChars("My Name is Manish");
		dos.writeChars("In My Life I love Code");
		dos.writeChars("I am writing My Own blog");

		dos.flush();
		dos.close();
		System.out.println("Done");
	}
}
