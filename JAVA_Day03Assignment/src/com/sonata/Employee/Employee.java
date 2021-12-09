package com.sonata.Employee;

public class Employee {
	int empId;
	String empName;
	double empSal ;
	
	Employee (int id,String n,double sal) {
		this.empId=id;
		this.empName= n;
		this.empSal=sal;
	}
	
	public void display() {
		System.out.println("Employee id is " + empId);	
		System.out.println("Employee name is " + empName);	
		System.out.println("Employee salary is " + empSal);	
	}
	
	public double  SalCal(double HRA, double DA) {
		double total = this.empSal + HRA + DA;
		return total;
	}
	

}
