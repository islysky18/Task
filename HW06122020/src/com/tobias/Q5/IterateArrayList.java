package com.tobias.Q5;

import java.util.ArrayList;
import java.util.List;

/*
Q5
 =================================================
| Write a Java Program to iterate ArrayList using |
| for-loop, while-loop, and advance for-loop	  |
==================================================
* */

public class IterateArrayList {

	public static void main(String[] args) {
	
		
		List<String> list = new ArrayList<>();
		list.add("Washington");
		list.add("Oregon");
		list.add("California");
		list.add("Arizona");
		list.add("New Mexico");
		list.add("Texas");

		System.out.println("Using for loop:");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===================================");
		
		System.out.println("Using while loop:");
		int w = 0;
		while (w < list.size()) {
			System.out.println(list.get(w));
			w++;
		}
		
		System.out.println("===================================");
		
		System.out.println("Using for each loop");
		
		for (String fe : list) {
			System.out.println(fe);
		}

		

	}

}
