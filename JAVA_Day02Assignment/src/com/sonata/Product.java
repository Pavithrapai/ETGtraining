package com.sonata;

public class Product {
	int proId;
	String proName;
	double proPrice;
	//double totalPrice;
	
	Product (int id,String name,double price) {
		this.proId=id;
		this.proName=name;
		this.proPrice=price;
	}
	public void display() {
			System.out.println(proId);
			System.out.println(proName);
			System.out.println(proPrice);
	}
	
	public double totPrice(double gst) {
		double total=(this.proPrice+(proPrice*(gst/100)));
			return total;
	}	
		public static void main(String args[]) {
				Product p1=new Product(123,"abcd",300);
				p1.display();
				System.out.println("The price after including gst is " + p1.totPrice(5));


				}
			

	}	


