package com.sonata.MyOwnAutoShopProject;

public class Car {
	int speed;
	double regularPrice;
	String color;
	
	Car (int spd,double regPrice,String col) {
		this.speed=spd;
		this.regularPrice=regPrice;
		this.color=col;
	}
	public double getSalePrice() {
		return regularPrice;
	}


}
