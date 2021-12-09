package com.sonata.Employee;

public class Developer extends Employee {

	public Developer(int a,String b,double c) {
		super(a,b,c);
	}
	
	public double SalCal(double HRA, double DA) {
		double total = super.SalCal(HRA, DA) + 2000;
		return total;
	}
	
	public static void main(String args[]) {
		Developer d = new Developer(1,"Rahul",30000);
		d.display();
		System.out.println("The total salary is " + d.SalCal(300, 500));
	}

	
}
