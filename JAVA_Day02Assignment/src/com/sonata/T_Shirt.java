package com.sonata;

public class T_Shirt {
	String color;
	String material;
	String design;
	
	T_Shirt (String c,String m,String d) {
		this.color=c;
		this.material=m;
		this.design=d;
	}
		public void display() {
			System.out.println(color);	
			System.out.println(material);	
			System.out.println(design);	
	}
		
		public static void main(String args[]) {
			T_Shirt small = new T_Shirt("Blue","Polyester","Sleeveless");
			T_Shirt large = new T_Shirt("White","Cotton","Scoop Neck");
			T_Shirt XL = new T_Shirt("Green","Linen","Crew Neck");
			
		System.out.println("1) The color,material and design of small size T_Shirt are " + small.color+" "+ small.design+ " "+ small.material);
		System.out.println("2) The color,material and design of Large size T_Shirt are " + large.color+" "+ large.design+ " "+ large.material);
		System.out.println("3) The color,material and design of XL size T_Shirt are " + XL.color+" "+ XL.design+ " "+ XL.material);
		}
	

}
