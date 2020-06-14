package com.tobias.Q3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Q3
 ================================================
| Write a Java Program to iterate HashMap using  |
| While and for each loop					     |
=================================================
* */

//CA 108,000
//NY 96.000
//TX 81,000
//WA 105.000
//OR 82.000

public class IterateHashMap {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("CA", 108000);
		map.put("NY", 96000);
		map.put("TX", 81000);
		map.put("WA", 105000);
		map.put("OR", 82000);
		
		System.out.println("While loop for the HashMap: ");
		
		int len = 0;
		

		
		Iterator whileIterator = map.entrySet().iterator();
		
		while (whileIterator.hasNext()) {
			Map.Entry<String, Integer> mapElement = (Map.Entry) whileIterator.next();
			System.out.println(mapElement.getKey() + " " + mapElement.getValue());
			
		}
		
		System.out.println("===============================================");
		System.out.println("For each loop for the Hash Map: ");
		for( String s : map.keySet()) {
			System.out.println(s + " " + map.get(s));
		}
		

	}

}
