package com.sonata.MyOwnAutoShopProject;

public class MyOwnAutoShop  {
	
	public static void main() 
	{
		Truck t = new Truck(100,400,"Blue",1000);
		System.out.println("The total price to be paid after discount is " + t.getSalePrice());
		
		Ford t1 = new Ford(100,400,"Blue",2005,30);
		System.out.println("The total price to be paid after manufacturer discount is " + t1.getSalePrice());
		
		Sedan t2 = new Sedan(100,400,"Blue",30);
		System.out.println("The total price to be paid after discount is " + t2.getSalePrice());


	}

}
