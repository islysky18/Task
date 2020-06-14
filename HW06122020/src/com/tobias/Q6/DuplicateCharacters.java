package com.tobias.Q6;

import java.util.HashMap;

/*
Q6
 ====================================================================
| Write a Java Program to find the duplicate characters in a string. |
=====================================================================
* */



public class DuplicateCharacters {
	
	
	public static void findDuplicate(String s) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}
		
		for (char ch : map.keySet()) {
			if (map.get(ch) > 1) {
				System.out.println(ch + ":" + map.get(ch));
			}
		}
		
	}

	public static void main(String[] args) {
		
		String s = "aabbc";
		System.out.println("Original String: " + s);
		System.out.println("");
		System.out.println("Duplicate Characters ");
		findDuplicate(s);

	}

}
