package com.tobias.Q4;



/*
Q4
 ==============================================================================
| Write a Java Program to find whether a string or number is palindrome or not.|
===============================================================================
* */

public class Palindrome {

	
	public static boolean palindrome(String s) {
		
		int x = 0, y = s.length() - 1;
	
		while (x < y) {
			if (s.charAt(x) != s.charAt(y)) {
				return false;
			} 
			x++;
			y--;
		}

		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		
		String s = "1221";
		System.out.println("String is: " + s);
		if(palindrome(s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
		

	}

}
