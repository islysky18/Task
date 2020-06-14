package com.tobias.Q10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

/*
Q10
 ==================================================================
| Write a Java Program to Find the Most Repeated Word in Text File |								 |
===================================================================
* */


public class FindMostRepeatedWord {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		BufferedReader br = null;
		try {
			
			br = new BufferedReader(new FileReader("/Users/wenchao-ting/Documents/SpringTuts/HW06122020/src/com/tobias/Q10/example.txt"));
			String line = br.readLine();
			
			while((line) != null) {
				String words[] = line.toLowerCase()
						.replace(",", "")
						.replace(".", "")
						.split(" ");
				
				for (String x : words) {
					if (!map.containsKey(x)) {
						map.put(x, 1);
					} else {
						map.put(x, map.get(x) + 1);
					}
				}

				line = br.readLine();
			}
			
			String mostRepeatWord = null;
			List<Entry<String, Integer>> repeatedList = new ArrayList<Entry<String, Integer>>();
			Integer count = null;
			
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			
			for (Entry<String, Integer> entry : entrySet) {
				if (count == null || entry.getValue() > count) {
					//mostRepeatWord = entry.getKey();
					count = entry.getValue();
					repeatedList.clear();
					repeatedList.add(entry);
				} else if (count == entry.getValue()) {
					repeatedList.add(entry);
				}
			}
			
			System.out.println("The total Words Occurrences pairs: " + entrySet);
//			System.out.println("The most repeated word: " + mostRepeatWord);
			System.out.println("The most repeated word: " + repeatedList);
			System.out.println("The occurrences: " + count);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
