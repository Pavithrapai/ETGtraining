package com.sonata.AbstractEmployee;


abstract class Employee {
	 int empID;
	 String empName;
	 Address obj;
	
	public static int noOfLeaves;
	public static double basicPay;
	abstract double calSal();
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	public static int getNoOfLeaves() {
		return noOfLeaves;
	}
	public static void setNoOfLeaves(int noOfLeaves) {
		Employee.noOfLeaves = noOfLeaves;
	}
	public static double getBasicPay() {
		return basicPay;
	}
	public static void setBasicPay(double basicPay) {
		Employee.basicPay = basicPay;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", obj=" + obj + "]";
	}
}
