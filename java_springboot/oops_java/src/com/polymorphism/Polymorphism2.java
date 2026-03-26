package com.polymorphism;

class Shape{
	public void area() {
		System.out.println("calculating area...");
	}
}

class Crircle extends Shape{
	private int r;

	public Crircle(int r) {
		super();
		this.r = r;
	}

	@Override
	public void area() {
		System.out.println("res: "+(3.14*this.r*r));
	}	
}


public class Polymorphism2 {
	public static void main(String[] args) {
		Shape s1 = new Crircle(2);
		s1.area();
	}
}
