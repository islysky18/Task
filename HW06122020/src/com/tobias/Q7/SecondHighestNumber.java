package com.tobias.Q7;

import java.util.ArrayList;
import java.util.List;

/*
Q7
 ====================================================================
| Write a Java Program to find the second highest number in an array |
=====================================================================
* */



public class SecondHighestNumber {

	public static void secondHighestNumber(int[] nums) {
		
		int first = Integer.MIN_VALUE; 
		int second = Integer.MIN_VALUE;
	
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > first && nums[i] > second) {
				second = first;
				first = nums[i];
			} else if (nums[i] > second && nums[i]< first) {
				second = nums[i];
			}
		}
		System.out.println(second);
		
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5, 5};
		List<Integer> list = new ArrayList<>();
		
		for (int i : nums) {
			list.add(i);
		}
		System.out.println("Given Array:" + list);
		System.out.println("");
		System.out.print("The second highest number: ");
		secondHighestNumber(nums);

	}

}
