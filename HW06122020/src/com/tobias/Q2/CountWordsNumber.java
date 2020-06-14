package com.tobias.Q2;

import java.util.HashMap;

/*
Q2
 =====================================================================
| Write a Java Program to count the number of words in a string using |
| HashMap													   		  |
======================================================================
* */



public class CountWordsNumber {

	
	public static void countWordsNumber(String s) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++ )
		{
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		
		System.out.println(map.entrySet());
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		String s = "Do you want to build a snow man?"; 
		countWordsNumber(s);
	}

}
