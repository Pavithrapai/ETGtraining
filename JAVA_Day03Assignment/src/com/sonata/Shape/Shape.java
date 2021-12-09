package com.sonata.Shape;

public class Shape {
	double length;
	double height;
	double width ;
	
	public Shape (double l,double h,double w) {
		this.length=l;
		this.height= h;
		this.width=w;
	}

	public Shape (double l) {
		this.length=l;
	}
	

	public Shape (double h,double w) {
		this.height= h;
		this.width=w;
	}
	public double CalArea() {
		return 0;
	}

}
