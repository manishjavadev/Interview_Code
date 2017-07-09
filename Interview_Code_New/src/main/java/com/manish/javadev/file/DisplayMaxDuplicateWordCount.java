package com.manish.javadev.file;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class DisplayMaxDuplicateWordCount {

	public Map<String, Integer> getWordCount(String fileName) {

		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while ((line = br.readLine()) != null) {
				String strArr[] = line.split(" ");
				String temp = null;
				for (int i = 0; i < strArr.length; i++) {
					temp = strArr[i];
					// wordMap.put(temp,
					// wordMap.containsKey(strArr[i])?wordMap.get(temp) + 1:1);
					if (wordMap.containsKey(strArr[i])) {
						wordMap.put(temp, wordMap.get(temp) + 1);
					} else {
						wordMap.put(temp, 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception ex) {
			}
		}
		return wordMap;
	}

	public List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap) {

		Set<Entry<String, Integer>> set = wordMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
				set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		return list;
	}

	public static void main(String a[]) {
		DisplayMaxDuplicateWordCount dmdwc = new DisplayMaxDuplicateWordCount();
		Map<String, Integer> wordMap = dmdwc.getWordCount("abc.txt");
		List<Entry<String, Integer>> list = dmdwc.sortByValue(wordMap);
		System.out.println(list.get(0));
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println("Key  = " + entry.getKey() + " And Value= "
					+ entry.getValue());
		}
	}
}
