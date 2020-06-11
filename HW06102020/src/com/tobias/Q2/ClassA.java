package com.tobias.Q2;


class ClassB {
	
	int c = 3;
	int d = 4;
	
	public ClassB() {
		System.out.println("Default Constructor");
	}
	
	public ClassB(int x, int y) {
		System.out.println("Paramerized Constructor");
	}
	
	void substract() {
		
	}
}

public class ClassA {

	int a = 1;
	int b = 2;
	
	ClassA() {
		System.out.println("Default Constructor");
	}
	
	ClassA(int a, int b) {
		System.out.println("Paramerized Constructor");
	}
	
	void add() {
		
	}
	
}
