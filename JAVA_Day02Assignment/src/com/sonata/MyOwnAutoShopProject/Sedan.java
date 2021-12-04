package com.sonata.MyOwnAutoShopProject;

public class Sedan extends Car {
	int length;
	
	Sedan (int spd,double regPrice,String col,int l)
	{
		super(spd,regPrice,col);
		this.length=l;
	}
	
	public double getSalePrice() 
	{
		if(length>20) 
		{
			return (super.getSalePrice()-(super.getSalePrice()*0.05));
		}
		
		else
		{
			return (super.getSalePrice()-(super.getSalePrice()*0.1));
		}
	}

	public static void main(String[] args) {
		Sedan s = new Sedan(100,400,"Blue",30);
		System.out.println("The total price to be paid after discount is " + s.getSalePrice());

	}

}
