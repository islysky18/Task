package com.tobias.Q5;


class Water {
	
	//Instance variables
	String type1 = "pure";
	String type2 = "mineral";
	String type3 = "ro";
	
	void cap(String type1, String type2, String type3) {
		
	}
	
	void taste() {
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
	}
}

public class Bottle {

	public static void main(String[] args) {

		Water water = new Water();
		water.taste();

	}

}
