package com.manish.javadev.file;
import java.io.*;
import java.util.*;

/**
 * @author Manish
 *
 */
/**
 * This code reading a file data and transpose the file data
 * abcde
 * lmno
 * mnk
 * ku
 * o
 * =====
 * this is the output of transpose file which is transpose of above file
 * almnko
 * bmnu
 * cnk
 * do
 * e
 * 
 * 
 */
public class TransposeFileData {
	String inputFile = "";
	String outputFile = "";
	List<String> list;
	char inputArray[][];
	char outArray[][];

	public TransposeFileData() {
		list = new ArrayList<String>();
		inputArray = new char[10][10];
		outArray = new char[10][10];
	}

	public void transpose() throws Exception {
		
		File file1 = new File("D:\\JAVA_FOLDER\\input.txt");
		File file2 = new File("D:\\JAVA_FOLDER\\output.txt");
		
		FileReader fr = new FileReader(file1);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		//Here i am reading file data and storing in list
		
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		//Here i am reading list and using toCharArray and storing
		//in inputArray array
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			char ch[] = str.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				inputArray[i][j] = ch[j];
			}
		}
		//Here i am reading input array but in transpose way
		//start form j and i index which mean transpose file in 
		//output array and then writing the outArray data in file 
		try {
			for (int i = 0; i < list.size(); i++) {

				for (int j = 0; j < inputArray[i].length; j++) {
					outArray[i][j] = inputArray[j][i];
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		FileWriter frw = new FileWriter(file2);
		BufferedWriter bw = new BufferedWriter(frw);
		
		//Here i am writing transpose file
		for (int i = 0; i < outArray.length; i++) {

			for (int j = 0; j < outArray.length; j++) {
				bw.write(outArray[i][j]);
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}

class TestTransposeFileData {
	public static void main(String[] args) throws Exception {
		TransposeFileData tfd = new TransposeFileData();
		tfd.transpose();
	
	}
}

