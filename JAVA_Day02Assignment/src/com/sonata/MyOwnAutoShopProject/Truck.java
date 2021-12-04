package com.sonata.MyOwnAutoShopProject;

public class Truck extends Car 
{
	int weight;
 
	Truck (int spd,double regPrice,String col,int wgt)
	{
		super(spd,regPrice,col);
		this.weight=wgt;
	}
		
		public double getSalePrice() 
		{
			if(weight>2000) 
			{
				return (super.getSalePrice()-(super.getSalePrice()*0.1));
			}
			
			else
			{
				return (super.getSalePrice()-(super.getSalePrice()*0.2));
			}
		}
		
		public static void main(String args[])
		{
			Truck t = new Truck(100,400,"Blue",1000);
			System.out.println("The total price to be paid after discount is " + t.getSalePrice());
		}
}
	



