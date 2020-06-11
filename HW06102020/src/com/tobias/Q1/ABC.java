package com.tobias.Q1;

public class ABC {

	//instance variable
	int b = 10;
	
	void f1(int a) {
	
		System.out.println("Local + Instance: " + (a + b));
		System.out.println("Local - Instance: " + (a - b));
		System.out.println("Local * Instance: " + (a * b));
		System.out.println("Local / Instance: " + (a / b));
	}
	
	
	public static void main(String[] args) {
		
		ABC abc1 = new ABC();
		abc1.f1(200);

	}

}
