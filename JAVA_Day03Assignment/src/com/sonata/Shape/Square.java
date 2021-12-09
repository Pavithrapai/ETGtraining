package com.sonata.Shape;

public class Square extends Shape {

	Square (double length) {
		super(length);
	}
	
	public double CalArea() {
		double area = super.length * super.length;
		return area;
	}
	
	public static void main(String args[]) {
		Square s = new Square(4);
		System.out.println("Area of Square is " + s.CalArea());
	}
	
	

}
