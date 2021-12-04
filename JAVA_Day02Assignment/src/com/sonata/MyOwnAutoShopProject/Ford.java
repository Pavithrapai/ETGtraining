package com.sonata.MyOwnAutoShopProject;

public class Ford extends Car {
	int year;
	int manufacturerDiscount;
	
	Ford (int spd,double regPrice,String col,int yr,int mfdiscnt)
	{
		super(spd,regPrice,col);
		this.year=yr;
		this.manufacturerDiscount=mfdiscnt;
	}
		
		public double getSalePrice() 
		{
			return super.getSalePrice()-manufacturerDiscount;
		}


	public static void main(String[] args) {
		Ford f = new Ford(100,400,"Blue",2005,30);
		System.out.println("The total price to be paid after manufacturer discount is " + f.getSalePrice());

		
	}

}
