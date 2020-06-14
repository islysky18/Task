package com.tobias.Q8;

/*
Q8
 ===============================================================
| Write a Java Program to remove all white spaces from a string	|
| without using replace. 										|
================================================================
* */

public class RemoveWhiteSpace {

	
	public static String removeWhiteSpace(String s) {
		
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				stringBuilder.append(s.charAt(i));
			}
		}
		return stringBuilder.toString();
	}
	
	public static void main(String[] args) {
		
		String s = "How are you";
		System.out.println(removeWhiteSpace(s));
		
	}

}
