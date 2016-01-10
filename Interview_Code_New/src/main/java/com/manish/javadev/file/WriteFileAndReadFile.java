package com.manish.javadev.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Manish
 *
 */
/**
 * This is simple program which is writing a file and reading a file
 * See below comment first part writing a file and second part reading file 
 * and printing in command prompt. 
 * 
 */
public class WriteFileAndReadFile {
	public static void main(String[] args) throws Exception {
		String inputFile = "abc.txt";
		//String outputFile = "abc1.txt";
		File inputfile = new File(inputFile);
		//File outputfile = new File(outputFile);
		//First Part 
		//This is writing a file logic
		FileWriter fw= new FileWriter(inputfile);
		fw.write("Java");
		fw.write("\n");
		fw.write("Developement");
		fw.write("\n");
		fw.write("Blog");
		fw.write("\n");
		fw.flush();
		fw.close();
		System.out.println("Done writing logic end here");
		System.out.println("\nReading logic start from here");
		// Writing logic end here
		//Second part
		//Start reading logic 
		FileReader fr= new FileReader(inputfile);
		char chr[];
		chr=new char[(int)inputfile.length()];
		fr.read(chr);
		String str= new String(chr);
		System.out.println(str);
		System.out.println("Done Reading logic end here");
		//End of reading logic here
		
		
	}

}
