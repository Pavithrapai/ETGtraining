package com.sonata.Shape;

public class Rectangle extends Shape {
	
	Rectangle (double height,double width) {
		super(height,width);
	}
	
	public double CalArea() {
		double area = super.height * super.width;
		return area;
	}
	
	public static void main(String args[]) {
		Rectangle rect = new Rectangle(5,6);
		System.out.println("Area of Rectangle is " + rect.CalArea());
	}
	
	
	

}
