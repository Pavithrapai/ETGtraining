package com.sonata.Employee;

public class Manager extends Employee{

	public Manager(int a,String b,double c) {
		super(a,b,c);
	}
	
	public double SalCal(double HRA, double DA) {
		double total = super.SalCal(HRA, DA);
		return total;
	}
	
	public static void main(String args[]) {
		Manager m = new Manager(13,"Raam",25000);
		m.display();
		System.out.println("The total salary is " + m.SalCal(300, 500));
	}
}
