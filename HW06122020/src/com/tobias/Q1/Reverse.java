package com.tobias.Q1;

import java.util.ArrayList;
import java.util.List;



/*
 Q1
 ======================================================================
|Write a Java Program to reverse a string without using String inbuilt |
|function reverse.													   |
 ======================================================================
 * */


public class Reverse {

	
	public static List<Character> reverse(String s) {
		
		List<Character> list = new ArrayList<>();
		
		for (int i = s.length()-1; i >= 0; i--) {
			
			list.add(s.charAt(i));
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverse(s));
		

	}

}
