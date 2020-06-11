package com.tobias.Q4;


class Pen{
	public void put(int putPenNumbers) {
		
	}
	
	public void take(int takePenNumbers) {
		
	}
}

class Pensil{
	
	int Paper = 100;	
	
}


public class Book {

	public void put(int putBookNumbers) {
		
	}
	
	public void take(int takeBookNumbers) {
		
	}
	
	public static void main(String[] args) {
		Pensil pensil = new Pensil(), pensil2 = new Pensil(), pensil3 = new Pensil(), pensil4 = new Pensil(), pensil5 = new Pensil();  
		pensil.Paper = 300;
		pensil2.Paper = 400;
		pensil3.Paper = 500;
		pensil4.Paper = 600;
		pensil5.Paper = 700;
		System.out.println(pensil.Paper);
		System.out.println(pensil2.Paper);
		System.out.println(pensil3.Paper);
		System.out.println(pensil4.Paper);
		System.out.println(pensil5.Paper);
	}

}
