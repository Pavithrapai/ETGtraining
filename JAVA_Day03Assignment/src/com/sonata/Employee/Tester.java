package com.sonata.Employee;

public class Tester extends Employee {

	public Tester(int a,String b,double c) {
		super(a,b,c);
	}
	
	public double SalCal(double HRA, double DA) {
		double total = super.SalCal(HRA, DA) + 5000;
		return total;
	}
	
	public static void main(String args[]) {
		Tester t = new Tester(125,"Rohan",60000);
		t.display();
		System.out.println("The total salary is " + t.SalCal(300, 500));
	}
}
