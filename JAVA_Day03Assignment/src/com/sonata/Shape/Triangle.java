package com.sonata.Shape;

public class Triangle extends Shape{
	Triangle (double height,double width) {
		super(height,width);
	}
	
	public double CalArea() {
		double area = 0.5 * super.height * super.width;
		return area;
	}
	
	public static void main(String args[]) {
		Triangle t = new Triangle(4,5);
		System.out.println("Area of Triangle is " + t.CalArea());
	}

}
