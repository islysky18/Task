package com.tobias.Q2;


class ClassB {
	
	//instance
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

	int firstInstance = 1;
	int secondInstance = 2;
	
	ClassA() {
		System.out.println("Default Constructor A");
	}
	
	ClassA(int a, int b, int c) {
		System.out.println("Paramerized Constructor" + a + b + c);
	}
	
	void show() {
		int classId = 10;
		int studentId = 1;
		String studentName = "Tobias";
		String studentMark = "A";
		System.out.println("Class ID: " + classId + "\tStudent ID: " + studentId + "\tStudent Name: " + studentName + "\tStudent Mark: " + studentMark);
	}
	
	
	public static void main(String[] args) {
		
		ClassA a1 = new ClassA(), a2 = new ClassA(), a3 = new ClassA(),a4 = new ClassA(),a5 = new ClassA();
		a1.secondInstance = 20;
		a2.secondInstance = 30;
		
		a1.firstInstance = 200;
		a2.firstInstance = 300;
		a3.firstInstance = 400;
		a4.firstInstance = 500;
		a5.firstInstance = 600;
		
		
		
		System.out.println("Second Instance Variable: " + a1.secondInstance);
		System.out.println("Second Instance Variable: " + a2.secondInstance);
		System.out.println("First Instance Variable: " + a1.firstInstance);
		System.out.println("First Instance Variable: " + a2.firstInstance);
		System.out.println("First Instance Variable: " + a3.firstInstance);
		System.out.println("First Instance Variable: " + a4.firstInstance);
		System.out.println("First Instance Variable: " + a5.firstInstance);
		
		
		ClassA p1 = new ClassA(1, 2, 3);
		p1.show();
		
	}
	
}
