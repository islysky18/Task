package com.tobias.Q9;

import java.util.ArrayList;
import java.util.List;

/*
Q9
 ========================================================
| How to find Missing Integers in Given Array of Numbers |
| with Duplicates in JAVA								 |
=========================================================
* */




public class MissingIntegers {

	
	public static void MissingIntegers(int[] nums) {
		
		int[] arr = new int[nums.length];
		
		for (int i : nums) {
			arr[i] = 1;
			
		}
		
		/*
		 * List<Integer> list = new ArrayList<>(); for (int i = 0; i < arr.length; i++)
		 * { list.add(arr[i]); }
		 * System.out.println(list);
		 */
		
		

		
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println(i);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,3,4,4,7,8,8,8};
		List<Integer> list = new ArrayList<>();
		for(int i : nums) {
			list.add(i);
		}
		
		System.out.println("Original Array: " + list);
		System.out.println("");
		System.out.println("Missing number: ");
		MissingIntegers(nums);
		

	}

}
